package org.example.focus_manager.Model;

import java.time.LocalDateTime;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsageTracking {
    private int id;
    private String fonctionnalite;
    private int utilisateurId;
    private String dateUtilisation;

    // Constructeurs, getters et setters
    public UsageTracking() {}

    public UsageTracking(int id, String fonctionnalite, int utilisateurId, String dateUtilisation) {
        this.id = id;
        this.fonctionnalite = fonctionnalite;
        this.utilisateurId = utilisateurId;
        this.dateUtilisation = dateUtilisation;
    }

    // Méthode pour enregistrer une utilisation dans la base de données
    public void enregistrerUsage() {
        String query = "INSERT INTO usage_tracking (fonctionnalite, utilisateur_id, date_utilisation) VALUES (?, ?, ?)";

        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, fonctionnalite);
            statement.setInt(2, utilisateurId);
            statement.setString(3, dateUtilisation);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
