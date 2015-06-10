package com.imc.driver.wait.data.access.bean;

import javax.ejb.Stateless;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.imc.driver.wait.data.access.ws.DriverWaitDataAccessService;

@Stateless(name="DriverWaitDAOService")
public class DriverWaitDataAccessBean {

	private final String serviceUrl = "http://localhost:8080/imc-driver-wait-service-data-access-war/DriverWaitDataAccessWS"; 
//	private final String serviceUrl = "http://10.10.10.6:8080/imc-driver-wait-service-data-access-war-0.0.1-SNAPSHOT/DriverWaitDataAccessWS"; 
	
	public DriverWaitDataAccessService driverWaitDAOService;
	
	public DriverWaitDataAccessBean(){
		this.driverWaitDAOService = createDAOService();
	}
	
	public DriverWaitDataAccessBean(DriverWaitDataAccessService service){
		this.driverWaitDAOService = service;
	}
	
	private DriverWaitDataAccessService createDAOService(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(DriverWaitDataAccessService.class);
		factory.setAddress(serviceUrl);
		DriverWaitDataAccessService daoService = (DriverWaitDataAccessService) factory
				.create();
		return daoService;
	}


}