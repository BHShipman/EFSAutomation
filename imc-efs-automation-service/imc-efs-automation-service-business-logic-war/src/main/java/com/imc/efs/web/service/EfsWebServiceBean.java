package com.imc.efs.web.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;


public class EfsWebServiceBean {

	private final String serviceUrl = "http://localhost:8080/imc-efs-automation-service-orchestration-war/EfsAutomationWS";
	
	public EfsAutoService efsService; 
	
	public EfsWebServiceBean(){
		this.efsService = createEfsService();
	}
	
	public EfsWebServiceBean(EfsAutoService efsService){
		this.efsService = efsService;
	}
	
	private EfsAutoService createEfsService(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(EfsAutoService.class);
		factory.setAddress(serviceUrl);
		EfsAutoService efsService = (EfsAutoService) factory
				.create();
		return efsService;
	}
}
