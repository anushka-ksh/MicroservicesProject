# 1. Use an official Java 17 runtime as a base image (matches your pom.xml)
FROM eclipse-temurin:17-jdk-alpine

# 2. Set the working directory inside the container
WORKDIR /app

# 3. Copy the compiled Java JAR file into the container
COPY target/*.jar app.jar

# 4. Expose the port the registry runs on
EXPOSE 8761

# 5. The command to start the application
ENTRYPOINT ["java", "-jar", "app.jar"]