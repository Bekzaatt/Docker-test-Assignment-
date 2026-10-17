FROM eclipse-temurin:25-jre
WORKDIR /app
COPY target/DockerTest-4.1.1.jar app.jar
ENV APP_NAME="Docker Demo"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
