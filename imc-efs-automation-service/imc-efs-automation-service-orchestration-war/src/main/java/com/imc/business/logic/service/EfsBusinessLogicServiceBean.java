package com.imc.business.logic.service;

import javax.ejb.Stateless;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

@Stateless(name="EfsBOService")
public class EfsBusinessLogicServiceBean {
	
	private final String serviceUrl = "http://localhost:8180/imc-efs-automation-service-business-logic-war/EfsAutomationBusinessLogicWS";
	//TODO Change to development server address
	public EfsAutomationBusinessLogicService efsBOService;
	
	public EfsBusinessLogicServiceBean(){
		this.efsBOService = createBOService();
	}
	
	public EfsBusinessLogicServiceBean(EfsAutomationBusinessLogicService efsBOService){
		this.efsBOService = efsBOService;
	}
	
	private EfsAutomationBusinessLogicService createBOService(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(EfsAutomationBusinessLogicService.class);
		factory.setAddress(serviceUrl);
		EfsAutomationBusinessLogicService boService = (EfsAutomationBusinessLogicService) factory
				.create();
		return boService;
	}

}
