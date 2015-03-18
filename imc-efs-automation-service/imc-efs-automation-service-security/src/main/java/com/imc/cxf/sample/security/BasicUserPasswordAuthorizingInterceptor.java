package com.imc.cxf.sample.security;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cxf.common.util.StringUtils;
import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.security.AccessDeniedException;
import org.apache.cxf.interceptor.security.AuthenticationException;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.message.Message;
import org.apache.cxf.service.Service;
import org.apache.cxf.service.invoker.MethodDispatcher;
import org.apache.cxf.service.model.BindingOperationInfo;
import org.apache.cxf.transport.Conduit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imc.cxf.sample.security.authenticate.UserAuthenticator;
import com.imc.cxf.sample.security.authenticate.impl.BaseUserNamePasswordAuthenticatorImpl;
import com.imc.cxf.sample.security.data.UserData;

public class BasicUserPasswordAuthorizingInterceptor extends AbstractPhaseInterceptor<Message> {
	private final Logger LOGGER = LoggerFactory
			.getLogger(BasicUserPasswordAuthorizingInterceptor.class);

	protected Map<String, List<String>> methodRolesMap = new HashMap<String, List<String>>();
//    protected Map<String, List<String>> userRolesMap = Collections.emptyMap();
    protected List<String> globalRoles = Collections.emptyList();
    
	public BasicUserPasswordAuthorizingInterceptor() {
		super(Phase.PRE_INVOKE);
	}

	public void handleMessage(Message message) throws Fault {

		AuthorizationPolicy policy = message.get(AuthorizationPolicy.class);

		// If the policy is not set, the user did not specify credentials.
		// 401 is sent to the client to indicate that authentication is
		// required.
		if (policy == null) {
			sendErrorResponse(message, HttpURLConnection.HTTP_UNAUTHORIZED);
		} else {

			String userId = policy.getUserName();
			String password = policy.getPassword();
	
			if(LOGGER.isDebugEnabled()){
				LOGGER.debug("username..[" + userId + "]...password["+  password + "]");
			}
				
			Method method = getTargetMethod(message);
			
			if(LOGGER.isDebugEnabled()){
				LOGGER.debug("getTargetMethod..[" + method + "]");
			}
	
			if (!authorizeUser(userId, password, method)) {
				sendErrorResponse(message, HttpURLConnection.HTTP_UNAUTHORIZED);
			}
		}
	}


    private boolean authorizeUser(String userId, String password, Method method) {
    	boolean isAuthorized = false;
    	
    	try {
			UserAuthenticator userAuthenticator = new BaseUserNamePasswordAuthenticatorImpl();
			UserData userData = userAuthenticator.authenticateUser(userId, password);
			
			if(userData != null) {
				if(LOGGER.isDebugEnabled()){
					LOGGER.debug("userData.........[" + userData + "]");
					LOGGER.debug("methodRolesMap...[" + methodRolesMap + "]");
				}
			    List<String> expectedRoles = getExpectedRoles(method);
			    
			    if(LOGGER.isDebugEnabled()){
					LOGGER.debug("expectedRoles...[" + expectedRoles + "]");
			    }
			    
			    if (!expectedRoles.isEmpty()) {			        
			    	if (isUserInRole(userData, expectedRoles)) {
			    		isAuthorized = true;
			        }
			    }
			}
		} catch (AuthenticationException e) {
			LOGGER.error("Error Authentication the user", e);
			isAuthorized = false;
		}

    	if(LOGGER.isDebugEnabled()){
			LOGGER.debug("authorize..isAuthorized[" + isAuthorized + "]");
    	}
		
        return isAuthorized;
    }
    
    protected List<String> getExpectedRoles(Method method) {
        List<String> roles = methodRolesMap.get(method.getName());
        if(LOGGER.isDebugEnabled()){
			LOGGER.debug("getExpectedRoles roles..[" + roles + "] for method[" + method.getName() + "]");
        }
        
        if (roles == null) {
            roles = methodRolesMap.get(method.getName());
        }
        
        if (roles != null) {
            return roles;
        }
        
        return globalRoles;
    }
    
    protected Method getTargetMethod(Message m) {
        BindingOperationInfo bop = m.getExchange().get(BindingOperationInfo.class);
        Method method = null;
        if (bop != null) {
            MethodDispatcher md = (MethodDispatcher) 
                m.getExchange().get(Service.class).get(MethodDispatcher.class.getName());
            method = md.getMethod(bop);
        } else {
	        method = (Method)m.get("org.apache.cxf.resource.method");
        }
        
        if (method == null) {
        	throw new AccessDeniedException("Method is not available : Unauthorized");
        }
        
        return method;
    }
    
    private boolean isUserInRole(UserData userData, List<String> roles) {
       
    	if(LOGGER.isDebugEnabled()){
			LOGGER.debug("isUserInRole roles..");
    	}
        
        boolean hasUserHasPermission = false;
        // Additional check.
//        if (!userRolesMap.isEmpty()) {
//            List<String> userRoles = userRolesMap.get(userId);    
//            if (userRoles == null) {
//            	hasUserHasPermission = false;
//            } else {
//	            for (String role : roles) {
//	                if (userRoles.contains(role)) {
//	                	hasUserHasPermission = true;
//	                	break;
//	                }
//	            }
//            }
//        } 
        
        if(userData != null && !userData.getRoles().isEmpty()){
        	for(String role: roles){
        		if(userData.getRoles().contains(role)){
        			hasUserHasPermission = true;
        			break;
        		}
        	}
        }
        
        if(LOGGER.isDebugEnabled()){
			LOGGER.debug("isUserInRole hasUserHasPermission...:" + hasUserHasPermission);
        }
        return hasUserHasPermission;
    }

	private void sendErrorResponse(Message message, int responseCode) {
		Message outMessage = getOutMessage(message);
		outMessage.put(Message.RESPONSE_CODE, responseCode);

		// Set the response headers
		@SuppressWarnings("unchecked")
		Map<String, List<String>> responseHeaders = (Map<String, List<String>>) message
				.get(Message.PROTOCOL_HEADERS);

		if (responseHeaders != null) {
			responseHeaders.put("WWW-Authenticate",
					Arrays.asList(new String[] { "Basic realm=realm" }));
			responseHeaders.put("Content-Length",
					Arrays.asList(new String[] { "0" }));
		}
		message.getInterceptorChain().abort();
		try {
			getConduit(message).prepare(outMessage);
			close(outMessage);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Message getOutMessage(Message inMessage) {
		Exchange exchange = inMessage.getExchange();
		Message outMessage = exchange.getOutMessage();
		if (outMessage == null) {
			Endpoint endpoint = exchange.get(Endpoint.class);
			outMessage = endpoint.getBinding().createMessage();
			exchange.setOutMessage(outMessage);
		}
		outMessage.putAll(inMessage);
		return outMessage;
	}

	private Conduit getConduit(Message inMessage) throws IOException {
		Exchange exchange = inMessage.getExchange();
//		EndpointReferenceType target = exchange
//				.get(EndpointReferenceType.class);
		Conduit conduit = exchange.getDestination().getBackChannel(inMessage);// exchange.getDestination().getBackChannel(inMessage,
																				// null,
																				// target);
		exchange.setConduit(conduit);
		return conduit;
	}

	private void close(Message outMessage) throws IOException {
		OutputStream os = outMessage.getContent(OutputStream.class);
		os.flush();
		os.close();
	}


    public void setMethodRolesMap(Map<String, String> rolesMap) {
        methodRolesMap.putAll(parseRolesMap(rolesMap)); 
    }
    
//    public void setUserRolesMap(Map<String, String> rolesMap) {
//        userRolesMap = parseRolesMap(rolesMap);
//    }
    
    public void setGlobalRoles(String roles) {
        globalRoles = Arrays.asList(StringUtils.split(roles, " "));
    }
    
    private static Map<String, List<String>> parseRolesMap(Map<String, String> rolesMap) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (Map.Entry<String, String> entry : rolesMap.entrySet()) {
            map.put(entry.getKey(), Arrays.asList(StringUtils.split(entry.getValue(), " ")));
        }
        return map;
    }    
}
