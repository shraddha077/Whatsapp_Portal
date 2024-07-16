package com.mypromotions.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypromotions.service.UserService;

@RestController
	@RequestMapping("/api/users")
	public class UserController {

	    @Autowired
	    private UserService userService;

	    @GetMapping
	    public List<User> findAll() {
	        return userService.findAll();
	    }

	    @GetMapping("/{id}")
	    public User findById(@PathVariable Long id) {
	        return userService.findById(id);
	    }

	    @PostMapping
	    public User save(@RequestBody User user) {
	        return userService.save(user);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteById(@PathVariable Long id) {
	        userService.deleteById(id);
	    }
	}


