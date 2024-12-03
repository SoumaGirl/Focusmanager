package org.example.focus_manager.Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/focusmanager";
    private static final String USER = "root";
    private static final String PASSWORD = "votre_mot_de_passe";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
