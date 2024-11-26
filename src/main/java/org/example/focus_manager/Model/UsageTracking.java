package org.example.focus_manager.Model;

import java.time.LocalDateTime;

public class UsageTracking {
    private int id;
    private String applicationName;
    private int usageTime;
    private LocalDateTime timestamp;

    public UsageTracking(int id, String applicationName, int usageTime, LocalDateTime timestamp) {
        this.id = id;
        this.applicationName = applicationName;
        this.usageTime = usageTime;
        this.timestamp = timestamp;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public int getUsageTime() {
        return usageTime;
    }

    public void setUsageTime(int usageTime) {
        this.usageTime = usageTime;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}