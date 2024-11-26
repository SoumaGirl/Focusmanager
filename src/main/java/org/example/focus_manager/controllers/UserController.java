package org.example.focus_manager.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.focus_manager.Model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserController {
    private Connection connection;

    // Constructeur avec connexion
    public UserController(Connection connection) {
        this.connection = connection;
    }

    // Méthode pour ajouter un utilisateur
    public void ajouterUser(User user) throws SQLException {
        String query = "INSERT INTO users (nom, email, mot_de_passe) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, user.getNom());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getMotDePasse());
            statement.executeUpdate();
        }
    }

    // Méthode pour récupérer tous les utilisateurs
    public List<User> obtenirTousLesUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM users";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("nom"),
                        resultSet.getString("email"),
                        resultSet.getString("mot_de_passe")
                );
                users.add(user);
            }
        }
        return users;
    }

    // Méthode pour supprimer un utilisateur
    public void supprimerUser(int userId) throws SQLException {
        String query = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, userId);
            statement.executeUpdate();
        }
    }
}