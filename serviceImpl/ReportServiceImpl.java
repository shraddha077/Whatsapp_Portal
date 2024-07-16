package com.mypromotions.serviceImpl;



import com.mypromotions.model.Report;
import com.mypromotions.repository.ReportRepository;
import com.mypromotions.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public List<Report> getReportsByUserId(Long userId) {
        return reportRepository.findByUserId(userId);
    }

    public Report getReportById(Long id) {
        Optional<Report> report = reportRepository.findById(id);
        return report.orElse(null);
    }

    public Report createReport(Report report) {
        return reportRepository.save(report);
    }

    public Report updateReport(Long id, Report report) {
        if (reportRepository.existsById(id)) {
            report.setId(id);
            return reportRepository.save(report);
        } else {
            return null;
        }
    }

    public void deleteReport(Long id) {
        reportRepository.deleteById(id);
    }
}
