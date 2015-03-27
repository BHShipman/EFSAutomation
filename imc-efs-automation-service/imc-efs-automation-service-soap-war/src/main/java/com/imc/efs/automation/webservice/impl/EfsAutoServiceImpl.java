package com.imc.efs.automation.webservice.impl;

import javax.ejb.EJB;
import javax.jws.WebService;

import com.imc.efs.automation.bo.EfsAutomationFacade;
import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.webservice.face.EfsAutoService;

@WebService(serviceName = "EfsAutoService", portName = "EfsAutoService", name = "EfsAutoService", endpointInterface = "com.imc.efs.automation.webservice.face.EfsAutoService")
public class EfsAutoServiceImpl implements EfsAutoService {

	@EJB(name="EfsAutomationFacade")
	EfsAutomationFacade efs;

	public boolean validateCredentials(String username, String password) {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
//				EfsConfig.class);
//		efs = ctx.getBean(EfsAutomationFacadeImpl.class);
//		try {
//			return efs.validateCredentials(username, password);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			ctx.close();
//		}
		return false;
	}

	public EfsMoneyCode requestEfsCheck(EfsCheckRequest request) {
		
		try {
			return efs.requestEfsCheck(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public EfsMoneyCode resumeEfsCheckIssuance(int requestId) {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
//				EfsConfig.class);
//		efs = ctx.getBean(EfsAutomationFacadeImpl.class);
//		try{
//		return efs.resumeEfsCheckIssuance(requestId);
//		}catch (Exception e){
//			e.printStackTrace();
//		}finally{
//			ctx.close();
//		}
		return null;
	}
}
