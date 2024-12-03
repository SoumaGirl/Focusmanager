package org.example.focus_manager.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.example.focus_manager.Model.UsageTracking;
import org.example.focus_manager.Model.Database;



public class UsageTrackingController {
    public void enregistrerUtilisation(String fonctionnalite, int utilisateurId) {
        UsageTracking usage = new UsageTracking();
        usage.setFonctionnalite(fonctionnalite);
        usage.setUserId(utilisateurId);
        usage.enregistrerUsage();
    }
}


