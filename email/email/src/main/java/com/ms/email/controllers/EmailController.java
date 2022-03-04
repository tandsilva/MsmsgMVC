package com.ms.email.controllers;
//e um metodo controlador de requisicoes controlador
import com.ms.email.dtos.EmailDto;
import com.ms.email.models.EmailModels;
import com.ms.email.services.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmailController {
    @Autowired
    EmailService emailService;

    @PostMapping("Sending-email")
    public ResponseEntity<EmailModels> sendingEmail(@RequestBody @Valid EmailDto emailDto) {
    EmailModels emailModels = new EmailModels();
        BeanUtils.copyProperties(emailDto,emailModels);
        emailService.sendEmail(emailModels);
        return new ResponseEntity<>(emailModels, HttpStatus.CREATED);
    }
}