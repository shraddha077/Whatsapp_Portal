package com.mypromotions.repository;

import com.mypromotions.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByUserId(Long userId); // Define query methods based on your entity properties

	Report findMessageReportByUserId(Long userId);

	Report findUserActivityReportByUserId(Long userId);
}
