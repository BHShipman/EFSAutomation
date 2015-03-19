package com.imc.efs.automation.bo;

import com.imc.efs.automation.entities.Requests;

public interface NotificationBO {

	public abstract String sendIssuanceEmail(Requests request, String moneyCode);

	public abstract String sendApprovalRequestEmail(Requests request);

}