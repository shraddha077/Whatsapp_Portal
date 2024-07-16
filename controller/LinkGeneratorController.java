package com.mypromotions.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.model.LinkGenerator;
import com.mypromotions.service.LinkGeneratorService;

import java.util.List;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/link-generator")
public class LinkGeneratorController {

    @Autowired
    @Qualifier("linkGeneratorServiceImpl") // Specify the bean name
    private LinkGeneratorService linkGeneratorService;

  

    @GetMapping
    public List<LinkGenerator> findAll() {
        return linkGeneratorService.findAll();
    }

    @GetMapping("/{id}")
    public LinkGenerator findById(@PathVariable Long id) {
        return linkGeneratorService.findById(id);
    }

    @PostMapping
    public LinkGenerator save(@RequestBody LinkGenerator linkGenerator) {
        return linkGeneratorService.save(linkGenerator);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        linkGeneratorService.deleteById(id);
    }
}

