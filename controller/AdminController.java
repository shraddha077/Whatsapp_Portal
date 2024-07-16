package com.mypromotions.controller;

import com.mypromotions.model.User;
import com.mypromotions.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return adminService.getAllUsers();
    }

    @PostMapping("/create-user")
    public User createUser(@RequestBody User user) {
        return adminService.createUser(user);
    }

    @DeleteMapping("/delete-user/{id}")
    public void deleteUser(@PathVariable Long id) {
        adminService.deleteUser(id);
    }
}
