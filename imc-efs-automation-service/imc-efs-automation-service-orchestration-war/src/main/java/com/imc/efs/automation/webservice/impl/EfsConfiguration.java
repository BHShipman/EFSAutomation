package com.imc.efs.automation.webservice.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.imc.business.logic.service.EfsBusinessLogicServiceBean;
import com.imc.efs.automation.facade.EfsAutomationFacade;
import com.imc.efs.automation.facade.impl.EfsAutomationFacadeImpl;
import com.imc.efs.security.BasicUserAuthenticator;

@Configuration
public class EfsConfiguration {

	@Bean
	public BasicUserAuthenticator basicAuthenticator(){
		return new BasicUserAuthenticator();
	}
	
	@Bean
	public EfsAutomationFacade efsAutomationFacade(){
		return new EfsAutomationFacadeImpl(efsBusinessLogicServiceBean());
	}
	
	@Bean
	public EfsBusinessLogicServiceBean efsBusinessLogicServiceBean(){
		return new EfsBusinessLogicServiceBean();
	}
}
