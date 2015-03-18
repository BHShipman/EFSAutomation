package com.imc.cxf.sample.standalone.server;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

import com.imc.cxf.sample.service.ChassisService;
import com.imc.cxf.sample.service.impl.ChassisServiceImpl;

public class ChassisServerStartUp {
	public static void main(String[] args) {
        JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
           sf.setResourceClasses(ChassisService.class);
           sf.setResourceProvider(ChassisService.class, 
               new SingletonResourceProvider(new ChassisServiceImpl()));
           sf.setAddress("http://localhost:9001/imc-cxf-webservice-template-rest-war/");
           Server server = sf.create();
            
           // destroy the server
           // uncomment when you want to close/destroy it
           //server.destroy();
            
   }
}
