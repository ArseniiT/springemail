package com.arseniit.controllers;

import com.arseniit.mail.MailSender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private MailSender mailSender;

    public MailController(@Qualifier("smtpMailSender") MailSender smtp) {
        this.mailSender = smtp;
    }

    @RequestMapping("/mail")
    public String mail(){

        mailSender.send("mailto@gmail.com", "Mock mail", "Body of the mock mail");

        return "Mail sent.";
    }
}
