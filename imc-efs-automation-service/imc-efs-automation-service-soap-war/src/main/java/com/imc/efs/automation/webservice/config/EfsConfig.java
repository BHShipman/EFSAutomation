package com.imc.efs.automation.webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.imc.efs.automation.bo.impl.CredentialsBOImpl;
import com.imc.efs.automation.bo.impl.DocBOImpl;
import com.imc.efs.automation.bo.impl.EfsAutomationFacadeImpl;
import com.imc.efs.automation.bo.impl.EfsBOImpl;
import com.imc.efs.automation.bo.impl.GpBOImpl;
import com.imc.efs.automation.bo.impl.NotificationBOImpl;
import com.imc.efs.automation.bo.impl.RequestBOImpl;
import com.imc.efs.automation.dao.impl.CredentialsDAOImpl;
import com.imc.efs.automation.dao.impl.DexDAOImpl;
import com.imc.efs.automation.dao.impl.EfsDAOImpl;
import com.imc.efs.automation.dao.impl.GpDAOImpl;
import com.imc.efs.automation.dao.impl.MailerDAOImpl;
import com.imc.efs.automation.dao.impl.RequestDAOImpl;
import com.imc.efs.automation.dao.impl.RequestTypeDAOImpl;
import com.imc.efs.automation.email.service.EmailServiceInvoker;

@Configuration
public class EfsConfig {

	@Bean
	public EfsAutomationFacadeImpl efsAutomationFacadeImpl(){
		return new EfsAutomationFacadeImpl(credentialsBOImpl(), docBOImpl(), efsBOImpl(), gpBOImpl(), notificationBOImpl(), requestBOImpl());
}
	
	@Bean
	public CredentialsBOImpl credentialsBOImpl(){
		return new CredentialsBOImpl(credsValidator());
	}
	
	@Bean
	public DocBOImpl docBOImpl(){
		return new DocBOImpl(dex());
	}
	
	@Bean
	public EfsBOImpl efsBOImpl(){
		return new EfsBOImpl(efs());
	}
	
	@Bean
	public GpBOImpl gpBOImpl(){
		return new GpBOImpl(gp());
	}
	
	@Bean
	public NotificationBOImpl notificationBOImpl(){
		return new NotificationBOImpl(mailer(), dex());
	}
	
	@Bean
	public RequestBOImpl requestBOImpl(){
		return new RequestBOImpl(requestDAO(), requestTypeDAO());
	}
	
	@Bean
	public CredentialsDAOImpl credsValidator(){
		return new CredentialsDAOImpl();
	}
	
	@Bean
	public DexDAOImpl dex(){
		return new DexDAOImpl();
	}
	
	@Bean
	public EfsDAOImpl efs(){
		return new EfsDAOImpl();
	}
	
	@Bean
	public GpDAOImpl gp(){
		return new GpDAOImpl();
	}
	
	@Bean
	public EmailServiceInvoker mailer(){
		return new EmailServiceInvoker();
	}
	
	@Bean
	public RequestDAOImpl requestDAO(){
		return new RequestDAOImpl();
	}
	
	@Bean
	public RequestTypeDAOImpl requestTypeDAO(){
		return new RequestTypeDAOImpl();
	}


}
