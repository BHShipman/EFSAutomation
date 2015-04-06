package com.imc.efs.automation.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.exception.NotImplemented;
import com.imc.efs.automation.exception.Unexpected;

@WebService
public interface EfsAutoService {

	@WebMethod
	boolean validateCredentials(String username, String password);

	@WebMethod
	EfsMoneyCode requestEfsCheck(EfsCheckRequest request)
			throws NotImplemented, Unexpected;

	@WebMethod
	EfsMoneyCode resumeEfsCheckIssuance(int requestId) throws NotImplemented,
			Unexpected;

}
