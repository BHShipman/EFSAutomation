package com.imc.efs.automation.webservice.impl;

import javax.jws.WebService;

import com.imc.efs.automation.bo.impl.CredentialsBOImpl;
import com.imc.efs.automation.bo.impl.DocBOImpl;
import com.imc.efs.automation.bo.impl.EfsAutomationFacadeImpl;
import com.imc.efs.automation.bo.impl.EfsBOImpl;
import com.imc.efs.automation.bo.impl.GpBOImpl;
import com.imc.efs.automation.bo.impl.NotificationBOImpl;
import com.imc.efs.automation.bo.impl.RequestBOImpl;
import com.imc.efs.automation.dao.impl.RequestDAOImpl;
import com.imc.efs.automation.dao.impl.RequestTypeDAOImpl;
import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.webservice.face.EfsAutoService;

@WebService(serviceName = "EfsAutoService", portName = "EfsAutoService", name = "EfsAutoService", endpointInterface = "com.imc.efs.automation.webservice.face.EfsAutoService")
public class EfsAutoServiceImpl implements EfsAutoService {

	public boolean validateCredentials(String username, String password) {
		EfsAutomationFacadeImpl efs = new EfsAutomationFacadeImpl(
				new CredentialsBOImpl(), new DocBOImpl(), new EfsBOImpl(),
				new GpBOImpl(), new NotificationBOImpl(), new RequestBOImpl(
						new RequestDAOImpl(), new RequestTypeDAOImpl()));
		return efs.validateCredentials(username, password);
	}

	public EfsMoneyCode requestEfsCheck(EfsCheckRequest request) {
		try {
			EfsAutomationFacadeImpl efs = new EfsAutomationFacadeImpl(
					new CredentialsBOImpl(), new DocBOImpl(), new EfsBOImpl(),
					new GpBOImpl(), new NotificationBOImpl(),
					new RequestBOImpl(new RequestDAOImpl(),
							new RequestTypeDAOImpl()));

			return efs.requestEfsCheck(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public EfsMoneyCode resumeEfsCheckIssuance(int requestId) {
		EfsAutomationFacadeImpl efs = new EfsAutomationFacadeImpl(
				new CredentialsBOImpl(), new DocBOImpl(), new EfsBOImpl(),
				new GpBOImpl(), new NotificationBOImpl(), new RequestBOImpl(
						new RequestDAOImpl(), new RequestTypeDAOImpl()));

		return efs.resumeEfsCheckIssuance(requestId);
	}

}
