package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jdk.vm.ci.meta.Local;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Tb_Email")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailid;
    private String ownerRef;
    private String emailFrom;
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
