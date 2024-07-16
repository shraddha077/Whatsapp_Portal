package com.mypromotions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.model.Message;
import com.mypromotions.service.AIPoweredMessagingService;


@RestController
@RequestMapping("/api/ai-messaging")
public class AIPoweredMessagingController {

    @Autowired
    private AIPoweredMessagingService aiPoweredMessagingService;

    @PostMapping("/generate-message")
    public Message generateMessage(@RequestBody String prompt) {
        return aiPoweredMessagingService.generateMessage(prompt);
    }
}

