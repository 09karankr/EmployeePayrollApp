# Employee Payroll Management System

A robust and modern RESTful API-based Employee Payroll Management System built with Spring Boot 3.x and Java 23.

## Overview

This system provides a comprehensive solution for managing employee payroll information with features for employee profile management, department assignments, and data validation.

## Features

- **Employee Management**
  - Complete CRUD operations for employee profiles
  - Profile creation with validation (name, salary, gender, start date)
  - Department assignment with many-to-many relationships
  - Profile picture support
  - Employee notes functionality

- **Data Validation & Error Handling**
  - Global exception handling with custom error responses
  - Input validation using Jakarta Validation annotations
  - Proper HTTP status codes and error messages
  - Comprehensive logging with SLF4J

- **Modern Development Practices**
  - Layered architecture (Controller, Service, Repository)
  - DTO pattern for data transfer
  - Environment-specific configurations (dev/prod)
  - Lombok for reducing boilerplate code

## Technology Stack

- **Backend Framework**: Spring Boot 3.x
- **Programming Language**: Java 23
- **Database**: MySQL
- **ORM**: Spring Data JPA/Hibernate
- **Build Tool**: Maven
- **API**: RESTful APIs
- **Other Tools**:
  - Lombok
  - SLF4J for logging
  - Jakarta Validation

## Getting Started

### Prerequisites

- Java 23 or later
- MySQL Server
- Maven

### Installation

1. Clone the repository
2. Configure the database connection in `application.properties`
3. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/employeepayroll/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       ├── model/
│   │       ├── dto/
│   │       └── exception/
│   └── resources/
│       └── application.properties
└── test/
```

## API Endpoints

The system provides RESTful endpoints for:

- Employee management (CRUD operations)
- Department management
- Profile picture upload
- Employee notes management

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

