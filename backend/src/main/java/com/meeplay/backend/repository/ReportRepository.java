package com.meeplay.backend.repository;

import com.meeplay.backend.model.Report;
import com.meeplay.backend.model.ReportStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Long> {
    List<Report> findByStatus(ReportStatus status);
}