package com.arseniit.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MockMailSender implements MailSender{

    private static Log log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String to, String subject, String body) {

        //temporary logging
        log.info("Sending Mock mail to " + to);
        log.info("with subject " + subject);
        log.info("and with body " + body);

    }
}
