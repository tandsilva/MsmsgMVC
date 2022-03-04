package com.ms.email.repositories;

import com.ms.email.models.EmailModels;
import org.springframework.data.jpa.repository.JpaRepository;
//foi extendida para poder usar metodos prontos
public interface EmailRepisitory extends JpaRepository<EmailModels, Long> {










}
