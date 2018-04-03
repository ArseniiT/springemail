package com.arseniit.controllers;

import com.arseniit.mail.MailSender;
import com.arseniit.mail.MockMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private MailSender mailSender = new MockMailSender();

    @RequestMapping("/mail")
    public String mail(){

        mailSender.send("mailto@gmail.com", "Mock mail", "Body of the mock mail");

        return "Mail sent.";
    }
}
