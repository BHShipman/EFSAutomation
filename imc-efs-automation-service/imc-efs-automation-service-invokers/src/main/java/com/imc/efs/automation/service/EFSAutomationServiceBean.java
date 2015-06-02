package com.imc.efs.automation.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class EFSAutomationServiceBean {

//	private final String serviceUrl="http://sectransw01.iilogistics.com:8080/imc-efs-automation-orchestration-service/EfsAutomationWS";
	private final String serviceUrl="http://localhost:8080/imc-efs-automation-service-orchestration-war/EfsAutomationWS";
	
	public EfsAutoService efsAutoService;
	
	public EFSAutomationServiceBean(){
		this.efsAutoService = createEfsService();
	}
	
	private EfsAutoService createEfsService(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(EfsAutoService.class);
		factory.setAddress(serviceUrl);
		
		return (EfsAutoService)factory.create();
	}
}
