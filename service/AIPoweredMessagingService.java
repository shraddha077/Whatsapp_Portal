package com.mypromotions.service;



import java.util.List;

import com.mypromotions.model.Message;
import com.mypromotions.repository.MessageRepository;

public interface AIPoweredMessagingService {
    Message sendMessage(MessageRepository messageRepository);
    List<Message> getMessagesByCampaignId(Long campaignId);
	Message sendMessage(Message message);
	Message generateMessage(String prompt);
}

