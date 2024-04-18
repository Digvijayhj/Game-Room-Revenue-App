# Use the official OpenJDK base image
FROM openjdk:21-jdk

# Add Maintainer Info
LABEL maintainer="dhethurjagadeesha1@csudh.edu"

# Set the working directory inside the container
WORKDIR /app

# Copy the built executable JAR into the container
COPY target/Game-Room-Revenue-App-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
