package com.imc.dex.service;

import javax.ejb.Stateless;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;


@Stateless(name="DexService")
public class DexServiceInvoker {

	private static final String serviceUrl = "http://services.iils.com/api/ifs/soap";

	private DexService createService(){
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(DexService.class);
		factory.setAddress(serviceUrl);
		DexService dexService = (DexService) factory
				.create();
		return dexService;
		
	}
	
	
	public ServerInfo upload(IndexedFile file){
		DexService service = createService();
		
		return service.upload(file);
	}
	
}
