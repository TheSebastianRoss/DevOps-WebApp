FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/bxaseball-sim-backend-api.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]