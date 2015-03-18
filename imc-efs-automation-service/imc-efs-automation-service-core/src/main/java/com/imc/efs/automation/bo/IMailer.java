package com.imc.efs.automation.bo;

public interface IMailer {

	void sendEmail(String to, String subject, String body);
	void sendEmail(String to, String subject, String body, String cc);
	void sendEmail(String to, String subject, String body, String cc, Iterable<String> filePaths);
	void sendEmail(String to, String subject, String body, Iterable<String> filePaths);
}
