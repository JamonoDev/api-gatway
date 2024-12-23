FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/transport-gateway-image.jar transport-gateway-image.jar
ENTRYPOINT ["java","-jar","/transport-gateway-image.jar"]