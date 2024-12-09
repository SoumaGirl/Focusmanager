package com.focus.controllers;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class TaskController {

    @FXML
    private PieChart taskPieChart;

    @FXML
    private Label totalTasksLabel;

    @FXML
    private Label completedTasksLabel;

    @FXML
    private Label completedPercentLabel;

    @FXML
    private Label pendingTasksLabel;

    @FXML
    private Label pendingPercentLabel;

    @FXML
    private ListView<String> completedTasksList;

    @FXML
    private ListView<String> pendingTasksList;

    @FXML
    public void initialize() {

        System.out.println("TaskCardController initialized");

        if (taskPieChart == null || completedTasksList == null || pendingTasksList == null) {
            System.out.println("FXML components are not initialized!");
            return;
        }
        // Populate Pie Chart with Task Data
        taskPieChart.getData().add(new PieChart.Data("Completed Tasks", 15));
        taskPieChart.getData().add(new PieChart.Data("Pending Tasks", 10));

        // Set Task Summary Labels
        totalTasksLabel.setText("Total Tasks: 25");
        completedTasksLabel.setText("Completed: 15");
        completedPercentLabel.setText("60% of total");
        pendingTasksLabel.setText("Pending: 10");
        pendingPercentLabel.setText("40% of total");

        // Populate Task Lists
        completedTasksList.getItems().addAll(
                "Submit project report",
                "Complete JavaFX tutorial",
                "Plan weekly schedule",
                "Update GitHub repository"
        );

        pendingTasksList.getItems().addAll(
                "Prepare meeting slides",
                "Organize desk workspace",
                "Finish reading book",
                "Respond to client emails",
                "Schedule health checkup"
        );
    }

    @FXML
    private void handleTaskSelection() {
        // Logic to handle task selection (e.g., moving a task between completed and pending)
        System.out.println("Task selected for modification.");
    }

    @FXML
    private void addTask() {
        // Logic to add a new task (to be connected to an input form)
        System.out.println("Add a new task.");
    }

    @FXML
    private void removeTask() {
        // Logic to remove a selected task
        System.out.println("Task removed.");
    }
}
