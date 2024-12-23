FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/transport-gatway-image.jar transport-gatway-image.jar
ENTRYPOINT ["java","-jar","/transport-gatway-image.jar"]