package com.mail.viewer.controllers;

import com.mail.viewer.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

@RestController
@RequestMapping("/mails")
public class MailController {

    @Autowired
    private MailService mailService;

    @RequestMapping(method = RequestMethod.GET)
    public List<String> getMails() throws GeneralSecurityException, IOException {

        return mailService.getMailIds();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getMails(@PathVariable String id) throws GeneralSecurityException, IOException {

        return mailService.getMail(id);
    }
}
