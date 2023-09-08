# Library Management Service

This project is an illustrative example of using microservices with Spring Boot. It's designed primarily as an educational resource for understanding how to architect, design, and implement microservices using Spring Boot.

## Overview

The Library Management Service is a microservices-based application that allows users to manage books, users, and lending operations in a library system.

## Services

1. **Book Service**: Manages the lifecycle of books in the library.
2. **User Service**: Handles user registrations, user profiles, and other related functionalities.
3. **Lending Service**: Manages the lending and return of books by users.

## Getting Started

### Prerequisites

- Java 11 or higher.
- Maven or Gradle (based on your preference).

### Setup & Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/library-management-service.git
   ```

2. Navigate to each service directory and build the projects:

   cd lm-book
   ./gradlew clean build


3. Start the services:

   For Book Service:

   ./gradlew bootRUn

   Repeat the above steps for other services.

### Database

This project uses the H2 in-memory database for simplicity and ease of setup, making it suitable for learning and experimentation.

## Purpose

This project is intended for educational purposes. It helps in understanding:

- The architecture and design of microservices.
- How to implement microservices using Spring Boot.
- Integrating various services and handling inter-service communication.
- Database operations using JPA and Hibernate with the H2 database.

## Contribution

If you wish to contribute, feel free to fork the project and submit a pull request. Contributions for educational content, improvements, and best practices are highly encouraged.

## Disclaimer

This project is for study and research purposes only. It's not recommended for production use.