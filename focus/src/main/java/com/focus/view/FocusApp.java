package com.focus.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FocusApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FocusApp.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setTitle("Focus App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
    
        launch(args);
    }
}
