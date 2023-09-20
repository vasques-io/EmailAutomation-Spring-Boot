/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myservice.emailservicehub.services;

import com.myservice.emailservicehub.models.EmailModel;
import com.myservice.emailservicehub.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fvasques
 */
@Service
public class EmailService {
    
    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
