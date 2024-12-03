CREATE DATABASE FocusManager;

USE FocusManager;

CREATE TABLE tasks (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       priority ENUM('Urgent-Important', 'Important', 'Urgent', 'Faible Priorité') NOT NULL,
                       status ENUM('Pending', 'Completed') DEFAULT 'Pending'
);

CREATE TABLE usage_tracking (
                                id INT AUTO_INCREMENT PRIMARY KEY,
                                application_name VARCHAR(255) NOT NULL,
                                usage_time INT NOT NULL, -- Temps en secondes
                                timestamp DATETIME DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE applications (
                                 id INT AUTO_INCREMENT PRIMARY KEY,
                                 nom VARCHAR(255) NOT NULL,
                                 duree_utilisation INT NOT NULL
);
CREATE TABLE users (
                                 id INT AUTO_INCREMENT PRIMARY KEY,
                                 nom VARCHAR(255) NOT NULL,
                                 email VARCHAR(255) NOT NULL UNIQUE,
                                 mot_de_passe VARCHAR(255) NOT NULL,
                                 date_creation TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);
