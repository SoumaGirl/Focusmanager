package com.focus.controllers;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class OverviewController {

    @FXML
    private Button backButton;

    @FXML
    private Button dayButton;

    @FXML
    private Button weekButton;

    @FXML
    private Button monthButton;

    @FXML
    private Button yearButton;

    @FXML
    private Label dateLabel;

    @FXML
    private Label totalTimeLabel;

    @FXML
    private BarChart<String, Number> timeDistributionChart;

    @FXML
    private CategoryAxis daysAxis;

    @FXML
    private NumberAxis timeAxis;

    @FXML
    private void initialize() {
        // Initialize the chart with sample data
        loadWeeklyData();
    }

    @FXML
    private void onDayButtonClicked() {
        dateLabel.setText("Today");
        totalTimeLabel.setText("Total focused time: 5min");
        loadDayData();
    }

    @FXML
    private void onWeekButtonClicked() {
        dateLabel.setText("Nov 19-25, 2024");
        totalTimeLabel.setText("Total focused time: 30min");
        loadWeeklyData();
    }

    @FXML
    private void onMonthButtonClicked() {
        dateLabel.setText("November 2024");
        totalTimeLabel.setText("Total focused time: 2h");
        loadMonthlyData();
    }

    @FXML
    private void onYearButtonClicked() {
        dateLabel.setText("Year 2024");
        totalTimeLabel.setText("Total focused time: 10h");
        loadYearlyData();
    }

    private void loadDayData() {
        timeDistributionChart.getData().clear();
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Focused Time");
        series.getData().add(new XYChart.Data<>("Morning", 5));
        timeDistributionChart.getData().add(series);
    }

    private void loadWeeklyData() {
        timeDistributionChart.getData().clear();
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Focused Time");
        series.getData().add(new XYChart.Data<>("Sunday", 1));
        series.getData().add(new XYChart.Data<>("Monday", 1));
        series.getData().add(new XYChart.Data<>("Tuesday", 10));
        series.getData().add(new XYChart.Data<>("Wednesday", 20));
        series.getData().add(new XYChart.Data<>("Thursday", 1));
        series.getData().add(new XYChart.Data<>("Friday", 1));
        series.getData().add(new XYChart.Data<>("Saturday", 1));
        timeDistributionChart.getData().add(series);
    }

    private void loadMonthlyData() {
        timeDistributionChart.getData().clear();
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Focused Time");
        for (int i = 1; i <= 30; i++) {
            series.getData().add(new XYChart.Data<>("Day " + i, Math.random() * 10));
        }
        timeDistributionChart.getData().add(series);
    }

    private void loadYearlyData() {
        timeDistributionChart.getData().clear();
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Focused Time");
        series.getData().add(new XYChart.Data<>("Jan", 10));
        series.getData().add(new XYChart.Data<>("Feb", 12));
        series.getData().add(new XYChart.Data<>("Mar", 15));
        series.getData().add(new XYChart.Data<>("Apr", 8));
        series.getData().add(new XYChart.Data<>("May", 20));
        series.getData().add(new XYChart.Data<>("Jun", 5));
        series.getData().add(new XYChart.Data<>("Jul", 9));
        series.getData().add(new XYChart.Data<>("Aug", 7));
        series.getData().add(new XYChart.Data<>("Sep", 10));
        series.getData().add(new XYChart.Data<>("Oct", 12));
        series.getData().add(new XYChart.Data<>("Nov", 14));
        series.getData().add(new XYChart.Data<>("Dec", 11));
        timeDistributionChart.getData().add(series);
    }
}
