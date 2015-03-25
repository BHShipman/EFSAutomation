package com.imc.efs.automation.webservice.impl;

import javax.jws.WebService;

import org.apache.cxf.interceptor.Fault;
import org.apache.webbeans.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
import com.imc.efs.automation.webservice.config.EfsConfig;
import com.imc.efs.automation.webservice.face.EfsAutoService;

@WebService(serviceName = "EfsAutoService", portName = "EfsAutoService", name = "EfsAutoService", endpointInterface = "com.imc.efs.automation.webservice.face.EfsAutoService")
public class EfsAutoServiceImpl implements EfsAutoService {

	EfsAutomationFacadeImpl efs;

	public boolean validateCredentials(String username, String password) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				EfsConfig.class);
		efs = ctx.getBean(EfsAutomationFacadeImpl.class);
		try {
			return efs.validateCredentials(username, password);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ctx.close();
		}
		return false;
	}

	public EfsMoneyCode requestEfsCheck(EfsCheckRequest request) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				EfsConfig.class);
		efs = ctx.getBean(EfsAutomationFacadeImpl.class);

		try {
			return efs.requestEfsCheck(request);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ctx.close();
		}
		return null;
	}

	public EfsMoneyCode resumeEfsCheckIssuance(int requestId) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				EfsConfig.class);
		efs = ctx.getBean(EfsAutomationFacadeImpl.class);
		try{
		return efs.resumeEfsCheckIssuance(requestId);
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			ctx.close();
		}
		return null;
	}
}
