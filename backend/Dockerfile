# Use OpenJDK 21 as base image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy project files (except target folder)
COPY . .

# Build the project
RUN ./mvnw clean package -DskipTests

# Copy the packaged JAR file to the container
COPY target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
