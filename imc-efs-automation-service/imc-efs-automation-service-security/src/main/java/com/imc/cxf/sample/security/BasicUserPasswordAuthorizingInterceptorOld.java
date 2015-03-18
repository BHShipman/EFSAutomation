package com.imc.cxf.sample.security;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.security.AuthenticationException;
import org.apache.cxf.interceptor.security.SimpleAuthorizingInterceptor;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.message.Message;
import org.apache.cxf.security.SecurityContext;
import org.apache.cxf.transport.Conduit;
import org.apache.cxf.ws.addressing.EndpointReferenceType;

import com.imc.cxf.sample.security.authenticate.UserAuthenticator;
import com.imc.cxf.sample.security.authenticate.impl.BaseUserNamePasswordAuthenticatorImpl;
import com.imc.cxf.sample.security.data.UserData;

public class BasicUserPasswordAuthorizingInterceptorOld extends
		SimpleAuthorizingInterceptor {

	@Override
	public void handleMessage(Message message) throws Fault {

		AuthorizationPolicy policy = message.get(AuthorizationPolicy.class);

		// If the policy is not set, the user did not specify credentials.
		// 401 is sent to the client to indicate that authentication is
		// required.
		if (policy == null) {
			sendErrorResponse(message, HttpURLConnection.HTTP_UNAUTHORIZED);
			return;
		}

		String userId = policy.getUserName();
		String password = policy.getPassword();

		System.out.println("username..[" + userId + "]...password[" + password
				+ "]");

		// CHECK USERNAME AND PASSWORD
		// if (!checkLogin(userId, password)) {
		// System.out
		// .println("handleMessage: Invalid username or password for user: "
		// + policy.getUserName());
		// sendErrorResponse(message, HttpURLConnection.HTTP_FORBIDDEN);
		// } else {
		SecurityContext sc = message.get(SecurityContext.class);
		if (sc == null) {
			return;
		}

		System.out.println("SecurityContext..[" + sc + "]");

		System.out.println("SecurityContext getUserPrincipal..["
				+ sc.getUserPrincipal() + "]");

		Method method = getTargetMethod(message);

		System.out.println("getTargetMethod..[" + method + "]");

		if (authorize(userId, password, method)) {
			return;
		} else {
			sendErrorResponse(message, HttpURLConnection.HTTP_UNAUTHORIZED);
		}
		// }

		// throw new AccessDeniedException("Unauthorized");
	}

	private boolean authorize(String userId, String password, Method method) {
		boolean isAuthorized = false;

		try {
			UserAuthenticator userAuthenticator = new BaseUserNamePasswordAuthenticatorImpl();
			UserData userData = userAuthenticator.authenticateUser(userId,
					password);

			if (userData != null) {
				System.out.println("methodRolesMap..[" + methodRolesMap + "]");

				List<String> expectedRoles = getExpectedRoles(method);

				System.out.println("expectedRoles..[" + expectedRoles + "]");
				if (!expectedRoles.isEmpty()) {

					if (isUserInRole(userId, expectedRoles, false)) {
						isAuthorized = true;
					}
				}
			}
		} catch (AuthenticationException e) {
			isAuthorized = false;
		}

		return isAuthorized;
	}

	@Override
	protected List<String> getExpectedRoles(Method method) {
		List<String> roles = methodRolesMap.get(method.getName());
		System.out.println("getExpectedRoles roles..[" + roles
				+ "] for method[" + method.getName() + "]");
		if (roles == null) {
			roles = methodRolesMap.get(method.getName());
		}
		if (roles != null) {
			return roles;
		}
		return globalRoles;
	}

	private boolean isUserInRole(String userId, List<String> roles, boolean deny) {

		System.out.println("isUserInRole roles..");
		// Additional check.
		if (!userRolesMap.isEmpty()) {
			List<String> userRoles = userRolesMap.get(userId);
			if (userRoles == null) {
				return false;
			}
			for (String role : roles) {
				if (userRoles.contains(role)) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
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
		EndpointReferenceType target = exchange
				.get(EndpointReferenceType.class);
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
}