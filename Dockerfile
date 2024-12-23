# Utiliser l'image officielle de OpenJDK comme base
FROM openjdk:17-jdk-slim

# Répertoire de travail
WORKDIR /app

# Ajouter le fichier JAR de l'application (assurez-vous que le fichier JAR est généré avant)
COPY target/api-gatway.jar /app/api-gatway.jar

# Exposer le port
EXPOSE 8080

# Exécuter le fichier JAR
CMD ["java", "-jar", "api-gatway.jar"]
