package com.focus.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Overview extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/focus/view/Overview.fxml"));
        primaryStage.setTitle("Overview");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        Stage stage = primaryStage;
        stage.setMinWidth(1024);  // Minimum width
        stage.setMinHeight(768); // Minimum height

    }

    public static void main(String[] args) {
        launch(args);
    }
}
