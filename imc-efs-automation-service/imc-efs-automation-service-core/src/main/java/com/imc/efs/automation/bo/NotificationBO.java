package com.imc.efs.automation.bo;

import com.imc.efs.automation.entities.Requests;

public interface NotificationBO {

	public abstract void sendIssuanceEmail(Requests request, String moneyCode) throws Exception;

	public abstract String sendApprovalRequestEmail(Requests request) throws Exception;

}