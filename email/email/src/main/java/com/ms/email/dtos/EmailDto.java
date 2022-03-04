package com.ms.email.dtos;
//esta classe enviara  estes atributos
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Data
public class EmailDto {
    @NotBlank//Vai enviar uma bad request avisando que o campo e obrigatorio
    private Long emailId;
    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email//para verificar se existe um email valido
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;


    private String text;//toda String vai ser brocuda




}
