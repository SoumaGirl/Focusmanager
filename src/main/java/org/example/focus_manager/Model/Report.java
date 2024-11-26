package org.example.focus_manager.Model;

public class Report {
    private String type;
    private int totalTimeUsed;
    private int tasksCompleted;

    public Report(String type, int totalTimeUsed, int tasksCompleted) {
        this.type = type;
        this.totalTimeUsed = totalTimeUsed;
        this.tasksCompleted = tasksCompleted;
    }

    // Getters et Setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public int getTotalTimeUsed() { return totalTimeUsed; }
    public void setTotalTimeUsed(int totalTimeUsed) { this.totalTimeUsed = totalTimeUsed; }
    public int getTasksCompleted() { return tasksCompleted; }
    public void setTasksCompleted(int tasksCompleted) { this.tasksCompleted = tasksCompleted; }
}

