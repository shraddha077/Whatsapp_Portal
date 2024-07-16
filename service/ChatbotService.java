package com.mypromotions.service;

import java.util.List;

import com.mypromotions.model.Chatbot;
import com.mypromotions.repository.ChatbotRepository;

public interface ChatbotService {
    Chatbot createChatbot(ChatbotRepository chatbotRepository);
    Chatbot getChatbotById(Long id);
    void deleteChatbot(Long id);
	List<Chatbot> findAll();
	Chatbot findById(Long id);
	Chatbot save(Chatbot chatbot);
	void deleteById(Long id);
	Chatbot createChatbot(ChatbotService chatbotDTO);
	String getName();
	Object getScript();
}
