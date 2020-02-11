package com.bcits.usecase.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailMail {
	@Autowired(required = false)
	private MailSender mailSender;

	public void emailSend(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendEmail(String from, String to, String subject, String msg) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(msg);
		mailSender.send(message);
		System.out.println("send mail method");
	}

	
}
