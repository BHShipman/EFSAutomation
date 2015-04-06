package com.imc.data.access.service;

import javax.ejb.Stateless;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

@Stateless(name="EfsDAOService")
public class EfsDataAccessServiceBean {

	private final String serviceUrl = "http://localhost:8080/imc-efs-automation-service-data-access-war/EfsAutomationDataAccessWS";
	
	public EfsAutomationDataAccessService efsDAOService;
	
	public EfsDataAccessServiceBean(){
		this.efsDAOService = createDAOService();
	}
	
	public EfsDataAccessServiceBean(EfsAutomationDataAccessService service){
		this.efsDAOService = service;
	}
	
	private EfsAutomationDataAccessService createDAOService(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(EfsAutomationDataAccessService.class);
		factory.setAddress(serviceUrl);
		EfsAutomationDataAccessService daoService = (EfsAutomationDataAccessService) factory
				.create();
		return daoService;
	}


}
