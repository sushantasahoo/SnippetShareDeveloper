package edu.sjsu.cmpe275.group12.mail.agent;

public interface MailAgent {

	public boolean sendRegistrationMail(String name, String mailID,
			String subject, String msg);

}
