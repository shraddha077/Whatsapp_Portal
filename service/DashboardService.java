package com.mypromotions.service;

import com.mypromotions.model.Report;
import com.mypromotions.model.User;

public interface DashboardService {
    Report getUserActivityReport(Long userId);
    Report getMessageReport(Long userId);
    String getStats();
    User getUserById(Long id);
}

