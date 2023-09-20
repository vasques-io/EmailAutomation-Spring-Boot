/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myservice.emailservicehub.repositories;

import com.myservice.emailservicehub.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fvasques
 */
public interface EmailRepository extends JpaRepository<EmailModel, Long>{
    
}
