package org.example.focus_manager.controllers;
import org.example.focus_manager.Model.Pomodoro;

public class PomodoroController {
    private Pomodoro pomodoro;

    public PomodoroController(int sessionDuration) {
        this.pomodoro = new Pomodoro(sessionDuration);
    }

    public void startPomodoro() {
        pomodoro.startSession();
    }

    public void completePomodoro() {
        pomodoro.completeSession();
    }

    public Pomodoro getPomodoroTimer() {
        return pomodoro;
    }
}

