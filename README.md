# Store E-Commerce Platform

A generic online shopping platform built with a Spring Boot backend and a focus on the overall infrastructure.  

## Technologies Used

- Java 17
- Spring Boot 3.5.4
- Spring Data JPA
- PostgreSQL
- Flyway Database Migration
- Thymeleaf Template Engine
- Project Lombok
- Spring DevTools

## Prerequisites

Before running the application, make sure you have:

- Java Development Kit (JDK) 17 or higher
- Maven 3.6+ installed
- PostgreSQL database server

## Environment Setup

Create a `.env` file in the project root directory with the following required variables:  
    - `DATABASE_URL`  
    - `DATABASE_USERNAME`  
    - `DATABASE_PASSWORD`  

## Database Configuration
1. Run a PostgreSQL database
2. Run `mvn flyway:migrate`
