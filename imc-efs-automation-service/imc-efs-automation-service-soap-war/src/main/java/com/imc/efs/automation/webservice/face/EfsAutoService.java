package com.imc.efs.automation.webservice.face;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;

@WebService
public interface EfsAutoService {

	@WebMethod
	boolean validateCredentials(String username, String password);

	@WebMethod
	EfsMoneyCode requestEfsCheck(EfsCheckRequest request);

	@WebMethod
	EfsMoneyCode resumeEfsCheckIssuance(int requestId);

}
