package com.imc.efs.automation.facade;

import com.imc.business.logic.service.NotImplemented_Exception;
import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.exception.NotImplemented;
import com.imc.efs.automation.exception.Unexpected;

public interface EfsAutomationFacade {

	boolean validateCredentials(String username, String password);

	EfsMoneyCode requestEfsCheck(EfsCheckRequest newRequest) throws NotImplemented, Unexpected, NotImplemented_Exception;

	EfsMoneyCode resumeEfsCheckIssuance(int requestId) throws NotImplemented, Unexpected, NotImplemented_Exception;
}
