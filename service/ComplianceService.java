package com.mypromotions.service;


public interface ComplianceService {
    boolean checkCompliance(String messageContent);
    void logComplianceIssue(String messageContent);
}
