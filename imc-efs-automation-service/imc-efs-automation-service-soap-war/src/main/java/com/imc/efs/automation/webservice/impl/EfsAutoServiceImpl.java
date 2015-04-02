package com.imc.efs.automation.webservice.impl;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import com.imc.efs.automation.bo.EfsAutomationFacade;
import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.exception.NotImplemented;
import com.imc.efs.automation.exception.Unexpected;
import com.imc.efs.automation.webservice.EfsAutoService;
import com.imc.efs.security.BasicUserAuthenticator;

@WebService(serviceName = "EfsAutomationWS", portName = "EfsAutomationWS", endpointInterface = "com.imc.efs.automation.webservice.EfsAutoService")
public class EfsAutoServiceImpl implements EfsAutoService {

	@EJB(name = "EfsAutomationFacade")
	EfsAutomationFacade efs;
	@EJB(name = "Authenticator")
	BasicUserAuthenticator auth;

	public boolean validateCredentials(String username, String password) {

		return false;
	}

	public EfsMoneyCode requestEfsCheck(EfsCheckRequest request)
			throws NotImplemented, Unexpected {

		if (auth.authenticateRequest(request.getUser(), request.getPass())) {
			return efs.requestEfsCheck(request);
		} else
			throw new Unexpected("Invalid Username and Password");

	}

	public EfsMoneyCode resumeEfsCheckIssuance(int requestId)
			throws NotImplemented, Unexpected {

		return efs.resumeEfsCheckIssuance(requestId);

	}
}
