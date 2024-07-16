package com.mypromotions.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.model.WhatsAppInstance;
import com.mypromotions.service.WhatsAppService;

import java.util.List;

@RestController
@RequestMapping("/api/whatsapp")
public class WhatsAppController {

    @Autowired
    private WhatsAppService whatsappService;

    @GetMapping
    public List<WhatsAppInstance> findAll() {
        return whatsappService.findAll();
    }

    @GetMapping("/{id}")
    public WhatsAppInstance findById(@PathVariable Long id) {
        return whatsappService.findById(id);
    }

    @PostMapping
    public WhatsAppInstance save(@RequestBody WhatsAppInstance whatsappInstance) {
        return whatsappService.save(whatsappInstance);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        whatsappService.deleteById(id);
    }
}
