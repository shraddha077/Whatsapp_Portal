package com.mypromotions.serviceImpl;

import com.mypromotions.model.Message;
import com.mypromotions.repository.MessageRepository;
import com.mypromotions.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public Message getMessageById(Long id) {
        Optional<Message> message = messageRepository.findById(id);
        return message.orElse(null);
    }

    @Override
    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public Message updateMessage(Long id, Message message) {
        if (messageRepository.existsById(id)) {
            message.setId(id);
            return messageRepository.save(message);
        } else {
            return null;
        }
    }

    @Override
    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }
}