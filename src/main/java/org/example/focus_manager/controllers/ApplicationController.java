package org.example.focus_manager.controllers;
import java.util.ArrayList;
import java.util.List;
import org.example.focus_manager.Model.Application;
import org.example.focus_manager.Model.Database ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApplicationController {
    private List<Application> applications;

    public ApplicationController() {
        this.applications = new ArrayList<>();
    }

    public void addApplication(String name, int timeLimit) {
        applications.add(new Application(name, timeLimit));
    }

    public void trackUsage(String appName, int timeUsed) {
        for (Application app : applications) {
            if (app.getName().equals(appName)) {
                app.addUsageTime(timeUsed);
            }
        }
    }

    public List<Application> getApplications() {
        return applications;
    }
}

