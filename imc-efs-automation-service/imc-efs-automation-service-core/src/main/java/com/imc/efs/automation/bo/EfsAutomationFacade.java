package com.imc.efs.automation.bo;

import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.exception.NotImplemented;
import com.imc.efs.automation.exception.Unexpected;

public interface EfsAutomationFacade {

	boolean validateCredentials(String username, String password);

	EfsMoneyCode requestEfsCheck(EfsCheckRequest newRequest) throws NotImplemented, Unexpected;

	EfsMoneyCode resumeEfsCheckIssuance(int requestId) throws Unexpected;
}
