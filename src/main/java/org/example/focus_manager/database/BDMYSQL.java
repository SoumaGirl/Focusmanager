package org.example.focus_manager.database.;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDeDonneesMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/focusmanager";
    private static final String USER = "focus_user";  // Changez par votre utilisateur MySQL
    private static final String PASSWORD = "secure_password";  // Changez par votre mot de passe

    private Connection connection;

    public void connecter() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion à la base de données réussie !");
        }
    }

    public void deconnecter() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("Déconnexion réussie.");
        }
    }

    public PreparedStatement preparerRequete(String requete) throws SQLException {
        if (connection == null || connection.isClosed()) {
            connecter();
        }
        return connection.prepareStatement(requete);
    }

    public ResultSet executerRequete(String requete) throws SQLException {
        PreparedStatement statement = preparerRequete(requete);
        return statement.executeQuery();
    }
}

