package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import lombok.Data;//para nao precisar do dos metodos get e set (chato pa dana)
import lombok.Generated;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name ="TB_Email")//o nome da tabela que vai ser gerada

public class EmailModels implements Serializable {
private static final long serialVersionUID = 1l;

@Id//a geraçao do id sera automatica
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;//para referenciar o id do usuario para poder criar um end point para lista os email enviados por um id
    private String emailFrom;
    private String emailTo;
    private String subject;

@Column(columnDefinition = "TEXT")//os stringos sao zuados eles aguentam 250 k so por isso e que foi criado este campo este aguenta mais ahhhhhhhhhhhhhh
private String text;//toda String vai ser brocuda
private LocalDateTime sendDateEmail;//data e tempo
private StatusEmail statusEmail;//ou babaca (nao esquece que nao é uma classe comum é (enum troxa hahahahahah)



}
