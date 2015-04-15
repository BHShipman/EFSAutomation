package com.imc.efs.automation.facade;

import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;

public interface EfsAutomationFacade {

	boolean validateCredentials(String username, String password);

	EfsMoneyCode requestEfsCheck(EfsCheckRequest newRequest) throws Exception;

	EfsMoneyCode resumeEfsCheckIssuance(int requestId) throws Exception;
}
