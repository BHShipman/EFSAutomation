package com.imc.efs.automation.webservice.impl;

import javax.ejb.EJB;
import javax.jws.WebService;

import com.imc.efs.automation.bo.EfsAutomationFacade;
import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.exception.NotImplemented;
import com.imc.efs.automation.exception.Unexpected;
import com.imc.efs.automation.webservice.EfsAutoService;

@WebService(serviceName = "EfsAutoService", portName = "EfsAutoService", name = "EfsAutoService", endpointInterface = "com.imc.efs.automation.webservice.EfsAutoService")
public class EfsAutoServiceImpl implements EfsAutoService {

	@EJB(name = "EfsAutomationFacade")
	EfsAutomationFacade efs;

	public boolean validateCredentials(String username, String password) {
		// AnnotationConfigApplicationContext ctx = new
		// AnnotationConfigApplicationContext(
		// EfsConfig.class);
		// efs = ctx.getBean(EfsAutomationFacadeImpl.class);
		// try {
		// return efs.validateCredentials(username, password);
		// } catch (Exception e) {
		// e.printStackTrace();
		// } finally {
		// ctx.close();
		// }
		return false;
	}

	public EfsMoneyCode requestEfsCheck(EfsCheckRequest request)
			throws NotImplemented, Unexpected {

		return efs.requestEfsCheck(request);

	}

	public EfsMoneyCode resumeEfsCheckIssuance(int requestId)
			throws NotImplemented, Unexpected {

		return efs.resumeEfsCheckIssuance(requestId);

	}
}
