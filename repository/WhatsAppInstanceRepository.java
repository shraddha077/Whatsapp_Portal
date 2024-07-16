package com.mypromotions.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mypromotions.model.WhatsAppInstance;

@Repository
public interface WhatsAppInstanceRepository extends JpaRepository<WhatsAppInstance, Long> {

	String getPhoneNumber();
}

