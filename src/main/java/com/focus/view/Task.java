package com.focus.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Task extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("src/main/resources/com/focus/view/Task.fxml"));
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.setTitle("Task Card");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}