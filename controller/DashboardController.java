package com.mypromotions.controller;

import com.mypromotions.model.User;
import com.mypromotions.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/stats")
    public String getStats() {
        return dashboardService.getStats();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) {
        return dashboardService.getUserById(id);
    }
}
