package org.example.focus_manager.controllers;
import java.util.ArrayList;
import java.util.List;
import org.example.focus_manager.Model.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TaskController {
    private List<Task> tasks;

    public TaskController() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description, String priority) {
        tasks.add(new Task(description, priority));
    }

    public void markTaskAsCompleted(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.get(taskIndex).markAsCompleted();
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}

