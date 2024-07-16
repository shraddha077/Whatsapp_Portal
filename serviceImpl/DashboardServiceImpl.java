package com.mypromotions.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypromotions.model.Report;
import com.mypromotions.model.User;
import com.mypromotions.repository.ReportRepository;
import com.mypromotions.repository.UserRepository;
import com.mypromotions.service.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReportRepository reportRepository;

    @Override
    public Report getUserActivityReport(Long userId) {
        // Fetch user activity report by user ID
        return reportRepository.findUserActivityReportByUserId(userId);
    }

    @Override
    public Report getMessageReport(Long userId) {
        // Fetch message report by user ID
        return reportRepository.findMessageReportByUserId(userId);
    }

    @Override
    public String getStats() {
        // Example logic to return some statistics
        long userCount = userRepository.count();
        long reportCount = reportRepository.count();
        return "Total users: " + userCount + ", Total reports: " + reportCount;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
