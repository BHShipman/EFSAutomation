package com.imc.efs.automation.bo;

import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;

public interface EfsAutomationFacade {

	boolean validateCredentials(String username, String password);

	EfsMoneyCode requestEfsCheck(EfsCheckRequest newRequest);

	EfsMoneyCode resumeEfsCheckIssuance(int requestId);
}
