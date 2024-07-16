package com.mypromotions.service;


import com.mypromotions.model.Report;

import java.util.List;

public interface ReportService {
    List<Report> getReportsByUserId(Long userId);
    Report getReportById(Long id);
    Report createReport(Report report);
    Report updateReport(Long id, Report report);
    void deleteReport(Long id);
}
