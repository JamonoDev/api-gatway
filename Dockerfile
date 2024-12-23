FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/api-gatway-image.jar api-gatway-image.jar
ENTRYPOINT ["java","-jar","/api-gatway-image.jar"]