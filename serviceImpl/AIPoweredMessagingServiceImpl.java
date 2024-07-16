package com.mypromotions.serviceImpl;

import com.mypromotions.model.Message;
import com.mypromotions.repository.MessageRepository;
import com.mypromotions.service.AIPoweredMessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AIPoweredMessagingServiceImpl implements AIPoweredMessagingService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Message sendMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public List<Message> getMessagesByCampaignId(Long campaignId) {
        return messageRepository.findByCampaignId(campaignId);
    }

	@Override
	public Message sendMessage(MessageRepository messageRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message generateMessage(String prompt) {
		// TODO Auto-generated method stub
		return null;
	}
}
