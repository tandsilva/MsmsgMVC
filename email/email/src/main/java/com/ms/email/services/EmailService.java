package com.ms.email.services;

import com.ms.email.repositories.EmailRepisitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//ferramenta do spring
public class  EmailService   {

 @Autowired//ferramenta de injeçao do repository
    EmailRepisitory emailRepisitory;



}
