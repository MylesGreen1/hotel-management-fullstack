# Hotel Management Full-Stack Application

A full-stack hotel management application built with Java, Spring Boot, Angular, REST APIs, JPA/Hibernate, and Docker.

## Overview

This project demonstrates full-stack application development using a Java and Spring Boot backend with an Angular frontend. The application includes reservation-related functionality, REST-based communication, database persistence, localization features, time-zone handling, and containerization.

## Technologies

- Java 17
- Spring Boot
- Angular
- TypeScript
- REST APIs
- JPA / Hibernate
- Maven
- Docker
- HTML
- CSS
- JavaScript

## Features

- Full-stack Java and Angular architecture
- REST API communication between frontend and backend
- Reservation and room data handling
- JPA/Hibernate persistence
- Multithreaded welcome-message functionality
- English and French localization support
- Time-zone conversion functionality
- Docker container configuration
- Maven-based build process

## Backend Structure

The backend is organized into several layers, including:

- Controllers / REST resources
- Services
- Repositories
- Entities
- Data transfer and response models
- Converters
- Configuration classes

This separation helps keep application logic organized and maintainable.

## Frontend

The Angular frontend handles the user interface and communicates with the Spring Boot backend through REST endpoints.

The frontend includes:

- Angular components
- TypeScript services
- Routing
- HTML templates
- CSS styling
- API integration

## API Example

The Spring Boot backend exposes REST endpoints that allow the frontend and other clients to retrieve application data.

### GET /api/welcome

Returns localized welcome messages in English and French.

**Request**

```http
GET http://localhost:8080/api/welcome
```

**Example Response**

```json
[
  "Welcome to the Landon Hotel!",
  "Bienvenue à l'hôtel Landon!"
]
```

The endpoint uses Spring Boot REST controllers and a localization service to generate the English and French messages. The messages are processed asynchronously using `CompletableFuture` and returned to the client as a JSON response.

## Development Skills Demonstrated

This project demonstrates experience with:

- Object-oriented programming
- Full-stack development
- REST API integration
- Relational data persistence
- Debugging and troubleshooting
- Multithreading
- Localization and internationalization
- Time-zone handling
- Git version control
- Docker containerization
- Maven dependency and build management

## Development Process

AI-assisted development tools were used as part of the problem-solving and debugging workflow. Suggested changes were reviewed, tested, and validated before being accepted into the application.

## Repository Notice

This repository is maintained privately for portfolio and interview-review purposes.