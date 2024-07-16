package com.mypromotions.service;

import com.mypromotions.model.Message;

import java.util.List;

public interface MessageService {
    List<Message> getAllMessages();
    Message getMessageById(Long id);
    Message createMessage(Message message);
    Message updateMessage(Long id, Message message);
    void deleteMessage(Long id);
}