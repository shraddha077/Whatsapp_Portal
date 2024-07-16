package com.mypromotions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.model.Chatbot;
import com.mypromotions.service.ChatbotService;

import java.util.List;

@RestController
@RequestMapping("/api/chatbots")
public class ChatbotController {

    @Autowired
    private ChatbotService chatbotService;

    @GetMapping
    public List<Chatbot> findAll() {
        return chatbotService.findAll();
    }

    @GetMapping("/{id}")
    public Chatbot findById(@PathVariable Long id) {
        return chatbotService.findById(id);
    }

    @PostMapping
    public Chatbot save(@RequestBody Chatbot chatbot) {
        return chatbotService.save(chatbot);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        chatbotService.deleteById(id);
    }
}
