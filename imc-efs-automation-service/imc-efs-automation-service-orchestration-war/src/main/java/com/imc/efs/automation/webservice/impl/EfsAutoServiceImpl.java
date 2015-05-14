package com.imc.efs.automation.webservice.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.facade.EfsAutomationFacade;
import com.imc.efs.automation.webservice.EfsAutoService;
import com.imc.efs.security.BasicUserAuthenticator;

@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
@WebService(serviceName = "EfsAutomationWS", portName = "EfsAutomationWS", endpointInterface = "com.imc.efs.automation.webservice.EfsAutoService")
public class EfsAutoServiceImpl implements EfsAutoService {

	EfsAutomationFacade efs;
	BasicUserAuthenticator auth;
	AnnotationConfigApplicationContext ctx;

	final static Logger log = Logger.getLogger("EfsAutoServiceImpl");

	@WebMethod
	public boolean validateCredentials(String username, String password) {

		return false;
	}

	@WebMethod
	public EfsMoneyCode requestEfsCheck(@WebParam(name = "Request")EfsCheckRequest request)
			throws Exception {
		ctx = new AnnotationConfigApplicationContext(EfsConfiguration.class);
		
		auth = ctx.getBean(BasicUserAuthenticator.class);
		efs = ctx.getBean(EfsAutomationFacade.class);

		log.info("New Request - User: " + request.getUser() + " - Requester: " + request.getRequester());
		
		EfsMoneyCode moneyCode = null;
		if (auth.authenticateRequest(request.getUser(), request.getPass())) {
			try{
			moneyCode = efs.requestEfsCheck(request);
			} catch (Exception e){
				throw new Exception(e);
			}
			ctx.close();
			return moneyCode;
		} else{
			log.error("Invalid Username and Password");
			ctx.close();
			throw new Exception("Invalid Username and Password");
		}
		
	}

	@WebMethod
	public EfsMoneyCode resumeEfsCheckIssuance(int requestId)
			throws Exception {
		
		log.info("Resuming request for requestId: " + requestId);
		
		ctx = new AnnotationConfigApplicationContext(EfsConfiguration.class);
		efs = ctx.getBean(EfsAutomationFacade.class);
		
		EfsMoneyCode moneyCode = efs.resumeEfsCheckIssuance(requestId);
		ctx.close();
		return moneyCode;

	}
}
