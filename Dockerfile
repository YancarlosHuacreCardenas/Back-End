# Stage 1: build (si quieres construir dentro del contenedor) - opcional
# FROM maven:3.9.4-eclipse-temurin-17 AS build
# WORKDIR /app
# COPY pom.xml mvnw ./
# COPY .mvn .mvn
# COPY src src
# RUN mvn -B -DskipTests package

# Stage 2: run
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar /app/app.jar"]
