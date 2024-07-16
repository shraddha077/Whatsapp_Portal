package com.mypromotions.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypromotions.model.Chatbot;
import com.mypromotions.repository.ChatbotRepository;
import com.mypromotions.service.ChatbotService;

@Service
public class ChatbotServiceImpl implements ChatbotService {

    @Autowired
    private ChatbotRepository chatbotRepository;

    @Override
    public Chatbot createChatbot(ChatbotService chatbotService) {
        Chatbot chatbot = new Chatbot();
        chatbot.setName(chatbotService.getName());
        chatbot.setScript(chatbotService.getScript());
        return chatbotRepository.save(chatbot);
    }

    @Override
    public Chatbot getChatbotById(Long id) {
        return chatbotRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteChatbot(Long id) {
        chatbotRepository.deleteById(id);
    }

	@Override
	public Chatbot createChatbot(ChatbotRepository chatbotRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Chatbot> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Chatbot findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Chatbot save(Chatbot chatbot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getScript() {
		// TODO Auto-generated method stub
		return null;
	}
}

