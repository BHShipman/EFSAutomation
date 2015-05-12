package com.imc.efs.automation.email.monitor;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ejb.EJB;
import javax.mail.Address;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.imc.efs.automation.bo.RequestBO;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.enums.RequestStatuses;
import com.imc.efs.web.service.EfsWebServiceBean;
import com.imc.efs.web.service.Exception_Exception;

public class EmailMonitorService implements ServletContextListener {

	@EJB(name = "RequestBO")
	RequestBO requestBO;
	EfsWebServiceBean efsService = new EfsWebServiceBean();

	private static final String PROTOCOL = "imap";
	private static final String HOST = "webmail01.iilogistics.com";
	private final static String PORT = "993";
	private final static String USER_NAME = "bshipman";
	private final static String PASSWORD = "Dmmsbr27";
	
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ScheduledExecutorService scheduledExecutorService = Executors
				.newScheduledThreadPool(1);
		scheduledExecutorService.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				System.out.println("Checking Email");
				checkEmail();
				

			}
		}, (long) 0, (long) 15, TimeUnit.SECONDS);

	}

	private void checkEmail(){
		Properties properties = getServerProperties(PROTOCOL, HOST, PORT);
		Session session = Session.getInstance(properties);

		try {
			Store store = session.getStore(PROTOCOL);
			store.connect(USER_NAME, PASSWORD);

			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_WRITE);

			Message[] unreadMessages = inbox.search(
					new FlagTerm(new Flags(Flags.Flag.SEEN), false));

			for (Message message : unreadMessages) {
				if (!message.getFlags().contains(Flags.Flag.SEEN)) {
					Address[] fromAddresses = message.getFrom();
					String body = getText(message);
					Document doc = Jsoup.parse(body);
					Pattern requestPattern = Pattern.compile("#\\d+");
					Matcher match = requestPattern.matcher(message.getSubject());
					match.find();
					String requestNumber = match.group(0);
					requestNumber = requestNumber.substring(1, requestNumber.length());
					if (doc.body().child(0).child(0).child(0).text().matches("(?i:.*REJECTED.*)")){
						Requests request = requestBO.getRequest(Integer.valueOf(requestNumber).intValue());
						request.getStatus().setStatusId(RequestStatuses.Voided.index());
						requestBO.updateRequest(request);
					}
					if (doc.body().child(0).child(0).child(0).text().matches("(?i:.*APPROVED.*)")){
						System.out.println("found approved");
						Requests request = requestBO.getRequest(Integer.valueOf(requestNumber).intValue());
						request.getStatus().setStatusId(RequestStatuses.Issued.index());
						request.setApprover(fromAddresses[0].toString());
						request.setIssuer(fromAddresses[0].toString());
						requestBO.updateRequest(request);
						efsService.efsService.resumeEfsCheckIssuance(request.getRequestId());
					}
					
					
					
				}
			}

			inbox.close(false);
			store.close();

		} catch (NoSuchProviderException ex) {
			ex.printStackTrace();
		} catch (MessagingException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception_Exception e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private String getText(Part p) throws MessagingException, IOException {
		if (p.isMimeType("text/*")) {
			String s = (String) p.getContent();
			return s;
		}
		return null;
	}
	
	private Properties getServerProperties(String protocol, String host,
			String port) {
		Properties properties = new Properties();

		properties.put(String.format("mail.%s.host", protocol), host);
		properties.put(String.format("mail.%s.port", protocol), port);
		properties.setProperty(
				String.format("mail.%s.socketFactory.class", protocol),
				"javax.net.ssl.SSLSocketFactory");
		properties.setProperty(
				String.format("mail.%s.socketFactory.fallback", protocol),
				"false");
		properties.setProperty(
				String.format("mail.%s.socketFactory.port", protocol),
				String.valueOf(port));

		return properties;
	}
}
