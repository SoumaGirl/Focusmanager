package org.example.focus_manager.controllers;
import org.example.focus_manager.Model.Report;

import java.util.ArrayList;
import java.util.List;

public class ReportController {
    private List<Report> reports;

    public ReportController() {
        this.reports = new ArrayList<>();
    }

    public void generateReport(String type, int totalTimeUsed, int tasksCompleted) {
        reports.add(new Report(type, totalTimeUsed, tasksCompleted));
    }

    public List<Report> getReports() {
        return reports;
    }
}

