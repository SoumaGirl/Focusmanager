package org.example.focus_manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        Focus_Manageruid ui = new Focus_Manageruid();
        Scene scene = new Scene(ui.getLayout(), 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FocusManager");
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
