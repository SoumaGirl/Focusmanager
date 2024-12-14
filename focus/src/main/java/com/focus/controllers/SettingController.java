package com.focus.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleButton;

import java.util.Arrays;

public class SettingController {

    // FXML Fields
    @FXML private ToggleButton autoBreakToggle;
    @FXML private ToggleButton autoPomodoroToggle;
    @FXML private ComboBox<String> alarmSoundComboBox;
    @FXML private ComboBox<Integer> intervalsComboBox;
    @FXML private ComboBox<String> focusTimeComboBox;
    @FXML private ComboBox<String> shortBreakComboBox;
    @FXML private ComboBox<String> longBreakComboBox;

    // Initialization method
    @FXML
    public void initialize() {
        // Initialize Alarm Sound Options
        alarmSoundComboBox.getItems().addAll("Annonce", "Beep", "Chime", "Silent");
        alarmSoundComboBox.setValue("Annonce");

        // Initialize Intervals Options
        intervalsComboBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        intervalsComboBox.setValue(4);

        // Initialize Focus Time Options
        focusTimeComboBox.getItems().addAll("20min", "25min", "30min", "35min", "40min");
        focusTimeComboBox.setValue("25min");

        // Initialize Short Break Options
        shortBreakComboBox.getItems().addAll("3min", "5min", "7min", "10min");
        shortBreakComboBox.setValue("5min");

        // Initialize Long Break Options
        longBreakComboBox.getItems().addAll("10min", "15min", "20min", "25min");
        longBreakComboBox.setValue("15min");

        // Add listeners to ToggleButtons
        autoBreakToggle.setOnAction(event -> handleToggle(autoBreakToggle, "Pause automatique"));
        autoPomodoroToggle.setOnAction(event -> handleToggle(autoPomodoroToggle, "Pomodoro automatique"));
    }

    // Handle Toggle Actions
    private void handleToggle(ToggleButton toggleButton, String feature) {
        if (toggleButton.isSelected()) {
            System.out.println(feature + " activé.");
        } else {
            System.out.println(feature + " désactivé.");
        }
    }
}
