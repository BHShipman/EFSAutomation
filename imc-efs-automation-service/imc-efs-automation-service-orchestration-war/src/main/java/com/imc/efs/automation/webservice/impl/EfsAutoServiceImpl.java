package com.imc.efs.automation.webservice.impl;

import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.imc.business.logic.service.NotImplemented_Exception;
import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.exception.NotImplemented;
import com.imc.efs.automation.exception.Unexpected;
import com.imc.efs.automation.facade.EfsAutomationFacade;
import com.imc.efs.automation.webservice.EfsAutoService;
import com.imc.efs.security.BasicUserAuthenticator;

@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
@WebService(serviceName = "EfsAutomationWS", portName = "EfsAutomationWS", endpointInterface = "com.imc.efs.automation.webservice.EfsAutoService")
public class EfsAutoServiceImpl implements EfsAutoService {

	// @EJB(name = "EfsAutomationFacade")
	EfsAutomationFacade efs;
	// @EJB(name = "Authenticator")
	BasicUserAuthenticator auth;
	AnnotationConfigApplicationContext ctx;

	Logger log = Logger.getLogger("EfsAutoServiceImpl");

	@WebMethod
	public boolean validateCredentials(String username, String password) {

		return false;
	}

	@WebMethod
	public EfsMoneyCode requestEfsCheck(EfsCheckRequest request)
			throws NotImplemented, Unexpected, NotImplemented_Exception {
		ctx = new AnnotationConfigApplicationContext(EfsConfiguration.class);
		
		auth = ctx.getBean(BasicUserAuthenticator.class);
		efs = ctx.getBean(EfsAutomationFacade.class);

		log.info("New Request - User: " + request.getUser() + " Amount: " + request.getEfsAmount());
		
		
		if (auth.authenticateRequest(request.getUser(), request.getPass())) {
			EfsMoneyCode moneyCode = efs.requestEfsCheck(request);
			ctx.close();
			return moneyCode;
		} else{
			ctx.close();
			throw new Unexpected("Invalid Username and Password");
		}
		
	}

	@WebMethod
	public EfsMoneyCode resumeEfsCheckIssuance(int requestId)
			throws NotImplemented, Unexpected, NotImplemented_Exception {
		
		log.info("Resuming request for requestId: " + requestId);
		
		ctx = new AnnotationConfigApplicationContext(EfsConfiguration.class);
		efs = ctx.getBean(EfsAutomationFacade.class);
		
		EfsMoneyCode moneyCode = efs.resumeEfsCheckIssuance(requestId);
		ctx.close();
		return moneyCode;

	}
}
