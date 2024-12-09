package com.focus.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;

public class SigninController {

    @FXML
    private TextField emailField;
    
    @FXML
    private PasswordField passwordField;
    
    @FXML
    private Button signInButton;

    // Handler for the Sign In button
    @FXML
    public void handleSignInClick() {
        // Your sign-in logic here
    }
}
