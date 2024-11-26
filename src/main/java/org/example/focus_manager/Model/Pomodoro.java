package org.example.focus_manager.Model;

public class Pomodoro {
    private int sessionDuration;
    private int timeUsed;
    private int completedSessions;

    public Pomodoro(int sessionDuration) {
        this.sessionDuration = sessionDuration;
        this.timeUsed = 0;
        this.completedSessions = 0;
    }

    public void startSession() {
        timeUsed = 0; // Réinitialiser pour une nouvelle session
    }

    public void completeSession() {
        completedSessions++;
    }

    // Getters et Setters
    public int getSessionDuration() { return sessionDuration; }
    public void setSessionDuration(int sessionDuration) { this.sessionDuration = sessionDuration; }
    public int getTimeUsed() { return timeUsed; }
    public void setTimeUsed(int timeUsed) { this.timeUsed = timeUsed; }
    public int getCompletedSessions() { return completedSessions; }
}

