package com.mypromotions.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

import com.mypromotions.model.Autoresponder;
import com.mypromotions.service.AutoresponderService;

import java.util.List;

	@RestController
	@RequestMapping("/api/autoresponders")
	public class AutoresponderController {

	    @Autowired
	    private AutoresponderService autoresponderService;

	    @GetMapping
	    public List<Autoresponder> findAll() {
	        return autoresponderService.findAll();
	    }

	    @GetMapping("/{id}")
	    public Autoresponder findById(@PathVariable Long id) {
	        return autoresponderService.findById(id);
	    }

	    @PostMapping
	    public Autoresponder save(@RequestBody Autoresponder autoresponder) {
	        return autoresponderService.save(autoresponder);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteById(@PathVariable Long id) {
	        autoresponderService.deleteById(id);
	    }
	}

