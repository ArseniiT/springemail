package com.arseniit.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SmtpMailSender implements MailSender{

    private static Log log = LogFactory.getLog(SmtpMailSender.class);

    @Override
    public void send(String to, String subject, String body) {

        //temporary logging
        log.info("Sending SMTP mail to " + to);
        log.info("with subject " + subject);
        log.info("and with body " + body);

    }
}
