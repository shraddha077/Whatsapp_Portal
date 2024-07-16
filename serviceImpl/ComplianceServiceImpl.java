package com.mypromotions.serviceImpl;


import org.springframework.stereotype.Service;

import com.mypromotions.service.ComplianceService;

@Service
public class ComplianceServiceImpl implements ComplianceService {

    @Override
    public boolean checkCompliance(String messageContent) {
        // Logic to check compliance
        return true;
    }

    @Override
    public void logComplianceIssue(String messageContent) {
        // Logic to log compliance issue
    }
}

