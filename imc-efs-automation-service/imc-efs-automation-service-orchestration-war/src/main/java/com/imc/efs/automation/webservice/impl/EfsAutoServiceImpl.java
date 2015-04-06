package com.imc.efs.automation.webservice.impl;

import javax.ejb.EJB;
import javax.jws.WebService;

import com.imc.business.logic.service.NotImplemented_Exception;
import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.exception.NotImplemented;
import com.imc.efs.automation.exception.Unexpected;
import com.imc.efs.automation.facade.EfsAutomationFacade;
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
			throws NotImplemented, Unexpected, NotImplemented_Exception {

		if (auth.authenticateRequest(request.getUser(), request.getPass())) {
			return efs.requestEfsCheck(request);
		} else
			throw new Unexpected("Invalid Username and Password");

	}

	public EfsMoneyCode resumeEfsCheckIssuance(int requestId)
			throws NotImplemented, Unexpected, NotImplemented_Exception {

		return efs.resumeEfsCheckIssuance(requestId);

	}
}
