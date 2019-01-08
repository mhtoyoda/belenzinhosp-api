package br.com.belenzinhosp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${email.to}")
    private String emailTo;

    public boolean sendEmail(String email, String subject, String text){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setText("Email FROM: "+email +" - "+text);
        message.setTo(emailTo);
        message.setSubject(subject);
        message.setSentDate(new Date());
        message.setFrom(email);
        try {
            mailSender.send(message);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
