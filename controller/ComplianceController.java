package com.mypromotions.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.service.ComplianceService;

@RestController
@RequestMapping("/api/compliance")
public class ComplianceController {

    @Autowired
    private ComplianceService complianceService;

    @PostMapping("/check-compliance")
    public boolean checkCompliance(@RequestBody String content) {
        return complianceService.checkCompliance(content);
    }
}

