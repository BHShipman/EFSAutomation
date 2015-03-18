package com.imc.efs.automation.helper;

import com.imc.efs.automation.bo.IMailer;

public class Mailer implements IMailer{

	//TODO find alternative Email provider
	
	public Mailer() {
	}

	
	public void sendEmail(String to, String subject, String body) {
		sendEmailFull(to, subject, body);
	}

	
	public void sendEmail(String to, String subject, String body, String cc) {
		sendEmailFull(to, subject, body, cc);
	}

	
	public void sendEmail(String to, String subject, String body, String cc,
			Iterable<String> filePaths) {
		sendEmailFull(to, subject, body, cc, filePaths);
	}

	
	public void sendEmail(String to, String subject, String body,
			Iterable<String> filePaths) {
		sendEmailFull(to, subject, body, filePaths);
	}
	
	private void sendEmailFull(String to, String subject, String body){
		//TODO 
	}
	
	private void sendEmailFull(String to, String subject, String body, String cc){
		//TODO
	}

	private void sendEmailFull(String to, String subject, String body, String cc, Iterable<String> filePaths){
		//TODO
	}
	
	private void sendEmailFull(String to, String subject, String body, Iterable<String> filePaths){
		//TODO
	}
	
	
}
