package com.focus.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;

public class FocusAppController {

    @FXML
    private TextField focusInput;

    @FXML
    private Label timerLabel;

    @FXML
    private Label sessionTimeLabel;

    @FXML
    private Button startSessionButton;

    @FXML
    private Button giveUpButton;

    @FXML
    private Button previousDateButton;

    @FXML
    private Button nextDateButton;

    @FXML
    private Label selectedDateLabel;

    @FXML
    private VBox taskContainer;

    @FXML
    private Button todayButton;

    @FXML
    private Button addButton;

    /**
     * Initialize the controller.
     */
    @FXML
    public void initialize() {
        try {
            focusInput.setPromptText("Intention");
            selectedDateLabel.setText("Thu, 22 Feb");
            timerLabel.setText("25:00");
            sessionTimeLabel.setText("18:03 → 18:28");
    
            startSessionButton.setOnAction(event -> startSession());
            giveUpButton.setOnAction(event -> giveUpSession());
            previousDateButton.setOnAction(event -> navigateDate(-1));
            nextDateButton.setOnAction(event -> navigateDate(1));
            todayButton.setOnAction(event -> showToday());
            addButton.setOnAction(event -> addNewTask());
    
            populateCalendar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Start a focus session.
     */
    private void startSession() {
        System.out.println("Focus session started!");
        // Logic to start a timer and update UI
    }

    /**
     * Give up the current session.
     */
    private void giveUpSession() {
        System.out.println("Session given up.");
        // Logic to reset the timer and update UI
    }

    /**
     * Navigate to a different date.
     * 
     * @param daysOffset Number of days to navigate (positive for forward, negative for backward).
     */
    private void navigateDate(int daysOffset) {
        System.out.println("Navigating date by " + daysOffset + " days.");
        // Logic to update the selected date label and refresh calendar view
    }

    /**
     * Show today's date.
     */
    private void showToday() {
        System.out.println("Navigating to today's date.");
        // Logic to update the selected date label to today's date
    }

    /**
     * Add a new task to the calendar.
     */
    private void addNewTask() {
        System.out.println("Adding a new task.");
        // Logic to add a new task to the calendar (this could open a dialog to input task details)
    }

    /**
     * Populate the calendar view with example tasks.
     */
    private void populateCalendar() {
        taskContainer.getChildren().clear();

        // Example tasks
        addTaskToCalendar("11:20", "Instagram", "#A569BD");
        addTaskToCalendar("13:08", "Messenger", "#A569BD");
        addTaskToCalendar("15:08", "Canva", "#A569BD");
        addTaskToCalendar("17:00", "Google", "#3498DB");
        addTaskToCalendar("18:20", "YouTube", "#3498DB");
    }

    /**
     * Add a task to the calendar view.
     *
     * @param time The time of the task.
     * @param description The task description.
     * @param color The background color of the task label.
     */
    private void addTaskToCalendar(String time, String description, String color) {
        HBox taskRow = new HBox(10);
        taskRow.setStyle("-fx-padding: 5; -fx-background-color: " + color + "; -fx-border-radius: 5;");
        taskRow.setSpacing(10);

        Label timeLabel = new Label(time);
        timeLabel.setStyle("-fx-text-fill: white; -fx-font-weight: bold;");

        Label descriptionLabel = new Label(description);
        descriptionLabel.setStyle("-fx-text-fill: white;");

        taskRow.getChildren().addAll(timeLabel, descriptionLabel);

        taskContainer.getChildren().add(taskRow);
    }
}
