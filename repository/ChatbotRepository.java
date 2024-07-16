package com.mypromotions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mypromotions.model.Chatbot;

@Repository
public interface ChatbotRepository extends JpaRepository<Chatbot, Long> {
}

