package org.example.focus_manager.Model;

public class Application {
    private String name;
    private int timeUsed;
    private int timeLimit;

    public Application(String name, int timeLimit) {
        this.name = name;
        this.timeLimit = timeLimit;
        this.timeUsed = 0;
    }

    public void addUsageTime(int time) {
        this.timeUsed += time;
    }

    public boolean isOverLimit() {
        return timeUsed > timeLimit;
    }

    // Getters et Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getTimeUsed() { return timeUsed; }
    public void setTimeUsed(int timeUsed) { this.timeUsed = timeUsed; }
    public int getTimeLimit() { return timeLimit; }
    public void setTimeLimit(int timeLimit) { this.timeLimit = timeLimit; }
}

