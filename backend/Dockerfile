# Use OpenJDK 21 as the base image
FROM openjdk:21-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application (JAR file)
COPY target/*.jar app.jar

# Expose the application port (Render defaults to 8080)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
