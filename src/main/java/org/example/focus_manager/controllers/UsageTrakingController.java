package org.example.focus_manager.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.example.focus_manager.Model.UsageTracking
import org.example.focus_manager.database.BDMYSQL;

public class UsageTrackingController {
    public void addUsage(UsageTracking usage) throws SQLException {
        Connection connection = BDMYSQL.getConnection();
        String query = "INSERT INTO usage_tracking (application_name, usage_time, timestamp) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, usage.getApplicationName());
        statement.setInt(2, usage.getUsageTime());
        statement.setTimestamp(3, java.sql.Timestamp.valueOf(usage.getTimestamp()));
        statement.executeUpdate();
        connection.close();
    }
}
