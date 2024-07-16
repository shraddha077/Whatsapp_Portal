package com.mypromotions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.model.Contact;
import com.mypromotions.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public List<Contact> findAll() {
        return contactService.findAll();
    }

    @GetMapping("/{id}")
    public Contact findById(@PathVariable Long id) {
        return contactService.findById(id);
    }

    @PostMapping
    public Contact save(@RequestBody Contact contact) {
        return contactService.save(contact);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        contactService.deleteById(id);
    }
}

