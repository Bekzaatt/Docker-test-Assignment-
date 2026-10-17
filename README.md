
# Docker Demo

A simple Spring Boot REST API containerized with Docker.

## Requirements

- Java 21
- Maven
- Docker

## Build the application

ls target/

## Build the Docker image

docker build -t docker-test .

## Run the container

docker run -d --name docker-test-container -p 8080:8080 -e APP_NAME="Docker Test" docker-test

## Test

Open http://localhost:8080/api

## Stop the container

docker rm -f docker-demo-container

