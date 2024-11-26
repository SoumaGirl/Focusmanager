package org.example.focus_manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FocusManager");
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
