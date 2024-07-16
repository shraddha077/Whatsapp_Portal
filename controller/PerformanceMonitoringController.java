package com.mypromotions.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.model.Report;
import com.mypromotions.service.PerformanceMonitoringService;

@RestController
@RequestMapping("/api/performance")
public class PerformanceMonitoringController {

    @Autowired
    private PerformanceMonitoringService performanceMonitoringService;

    @GetMapping("/report/{id}")
    public Report getReport(@PathVariable Long id) {
        return performanceMonitoringService.getReport(id);
    }

    @PostMapping("/generate-report")
    public Report generateReport() {
        return performanceMonitoringService.generateReport();
    }
}
