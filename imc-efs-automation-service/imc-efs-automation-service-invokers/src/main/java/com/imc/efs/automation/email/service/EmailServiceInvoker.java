package com.imc.efs.automation.email.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

@Stateless(name = "EmailService")
public class EmailServiceInvoker {

	private final String serviceUrl = "http://ils3.iilogistics.com:8080/imc-email-service/EmailService";
	private final String defaultFrom = "EFSAutomation@imccompanies.com";

	public void sendEmail(List<String> to, String subject, String body,
			List<String> cc, List<String> filePaths) throws IOException {
		sendEmailFull(to, subject, body, cc, filePaths);
	}

	private EmailServicePortType createEmailService() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(EmailServicePortType.class);
		factory.setAddress(serviceUrl);
		factory.setUsername("IMC_VENDOR_DISPATCH_ORDER_SVC");
		factory.setPassword("IMC_VENDOR_DISPATCH_ORDER_SVC_PWD9");
		EmailServicePortType emailService = (EmailServicePortType) factory
				.create();
		return emailService;
	}

	private void sendEmailFull(List<String> to, String subject, String body,
			List<String> cc, List<String> filePaths) throws IOException {
		EmailServicePortType emailService = createEmailService();

		SendEmailRequest request = getSendEmailRequest(to, subject, body, cc,
				filePaths);

		SendEmailResponse result = emailService.sendEmail(request);

		
	}

	private SendEmailRequest getSendEmailRequest(List<String> to,
			String subject, String body, List<String> cc, List<String> filePaths)
			throws IOException {

		SendEmailRequest request = new SendEmailRequest();

		// set subject
		EmailSubject emailSubject = new EmailSubject();
		emailSubject.setSubject(subject);
		request.setEmailSubject(emailSubject);

		// set body
		EmailContent emailContent = new EmailContent();
		emailContent.setContent(body);
		request.setNonTemplateEmailContent(emailContent);

		// set "from" address
		SenderInfo senderInfo = new SenderInfo();
		senderInfo.setFromEmailAddress(defaultFrom);
		request.setSenderInfo(senderInfo);

		// set "to" addresses
		RecipientInfo recipientInfo = new RecipientInfo();
		recipientInfo.setTestEmailAddresses(to);
		recipientInfo.setToEmailAddresses(to);

		// set "cc" addresses
		if (cc != null) {
			recipientInfo.setCcEmailAddresses(cc);
		}
		request.setRecipientInfo(recipientInfo);

		// set attachments (if any)
		if (filePaths != null && !filePaths.isEmpty()) {
			List<EmailAttachment> emailAttachments = new ArrayList<EmailAttachment>();
			for (String filePath : filePaths) {
				EmailAttachment emailAttachment = getEmailAttachment(filePath);
				emailAttachments.add(emailAttachment);
			}
			request.setEmailAttachments(emailAttachments);
		}

		return request;
	}

	private static EmailAttachment getEmailAttachment(String fileLocation)
			throws IOException {
		EmailAttachment emailAttachment = new EmailAttachment();
		File file = new File(fileLocation);
		byte[] data = new byte[(int) file.length()];
		int offset = 0;
		int numRead = 0;
		InputStream stream = null;

		System.out.println("Web Service Called Successfully");
		stream = new FileInputStream(file);

		while (offset < data.length
				&& (numRead = stream.read(data, offset, data.length - offset)) >= 0) {
			offset += numRead;
		}

		System.out.println("'Reading File............................");
		System.out.println("\n");
		System.out.println("Data Reading Successful");

		emailAttachment.setFileName(file.getName());
		emailAttachment.setFileData(data);

		stream.close();

		return emailAttachment;
	}

}
