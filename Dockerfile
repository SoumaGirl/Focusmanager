# Utilisation d'une image Java
FROM openjdk:17-jdk-slim

# Définir le répertoire de travail
WORKDIR /app

# Copier les fichiers du projet dans le conteneur
COPY . /app

# Compiler le projet
RUN javac src/main/*.java

# Commande pour exécuter l'application
CMD ["java", "-cp", "src/main", "main.App"]