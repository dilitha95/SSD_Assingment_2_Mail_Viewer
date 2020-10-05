package com.mail.viewer.services;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

/**
 * Handle the mail activities
 */
public interface MailService {
    /**
     * Retrieve the mail ids
     * @return mail ids
     * @throws GeneralSecurityException
     * @throws IOException
     */
    List<String> getMailIds() throws GeneralSecurityException, IOException;

    /**
     * Retrieve the mail
     * @param id mail id
     * @return mail
     * @throws IOException
     */
    public String getMail(String id) throws GeneralSecurityException, IOException;
}
