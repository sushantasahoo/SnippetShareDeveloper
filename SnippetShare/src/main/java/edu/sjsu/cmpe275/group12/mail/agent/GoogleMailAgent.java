package edu.sjsu.cmpe275.group12.mail.agent;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.ui.velocity.VelocityEngineUtils;

public class GoogleMailAgent implements MailAgent {

	private static final String SENDER_MAIL_ID = "cmpe275.team12@gmail.com";
	private static final String SENDER_PASSWORD = "rambharose";
	VelocityEngine velocityEngine;
	private final String REGISTRATION_FORM = "RegistrationMessage.vm";

	@Override
	public boolean sendRegistrationMail(String name, String mailID,
			String subject, String msg) {
		return sendMail(name, mailID, "Welcome to SnippetShare app", msg,
				REGISTRATION_FORM);
	}

	private boolean sendMail(String name, String mailID, String subject,
			String msg, String mailFrame) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.ssl.trust", "*");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(SENDER_MAIL_ID,
								SENDER_PASSWORD);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(SENDER_MAIL_ID));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(mailID));
			message.setSubject(subject);

			Map<String, Object> model = new HashMap<String, Object>();
			model.put("name", name);
			model.put("email", SENDER_MAIL_ID);
			model.put("message", msg);
			velocityEngine = new VelocityEngine();
			velocityEngine.setProperty("resource.loader", "class");
			velocityEngine
					.setProperty("class.resource.loader.class",
							"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
			String text = VelocityEngineUtils.mergeTemplateIntoString(
					velocityEngine, mailFrame, "UTF-8", model);

			message.setText(text);
			Transport.send(message);

			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
