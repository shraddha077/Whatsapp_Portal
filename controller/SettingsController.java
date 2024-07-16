package com.mypromotions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.model.User;
import com.mypromotions.service.SettingsService;

@RestController
@RequestMapping("/api/settings")
public class SettingsController {

    @Autowired
    private SettingsService settingsService;

    @PostMapping("/update")
    public User updateSettings(@RequestBody User user) {
        return settingsService.updateSettings(user);
    }
}

