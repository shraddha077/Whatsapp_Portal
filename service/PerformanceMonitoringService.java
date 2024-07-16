package com.mypromotions.service;

import com.mypromotions.model.Report;
import com.mypromotions.repository.ReportRepository;

public interface PerformanceMonitoringService {
    ReportRepository getRealTimeAnalytics(Long campaignId);
    ReportRepository getHistoricalData(Long campaignId);
	Report getReport(Long id);
	Report generateReport();
}

