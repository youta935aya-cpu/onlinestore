# Online Store Application

A Java-based web application built with Spring Boot for managing an online store product catalog. It includes a frontend using Thymeleaf templates and a backend that provides CRUD operations.

## Features

- Product Management: Create, Read, Update, and Delete operations for products.
- Web Interface: Frontend built with Thymeleaf templates.
- Architecture: Uses standard Spring MVC structure (Controllers, Services, Repositories).
- Database Integration: Uses Spring Data JPA.

## Technology Stack

- Framework: Spring Boot (Java)
- Template Engine: Thymeleaf
- Data Access: Spring Data JPA
- Build Tool: Maven

## Project Structure

```text
src/
├── main/
│   ├── java/com/example/onlinestore/
│   │   ├── business/      # Service layer
│   │   ├── dao/           # Entities and Repositories
│   │   ├── web/           # Controllers
│   │   └── OnlinestoreApplication.java # Application entry point
│   └── resources/
│       ├── application.properties
│       ├── static/
│       └── templates/     # HTML templates
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 21
- Maven 3.6+
- Git

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/youta935aya-cpu/onlinestore.git
   cd onlinestore
   ```

2. Build the project:
   ```cmd
   mvnw.cmd clean install
   ```

3. Run the application:
   ```cmd
   mvnw.cmd spring-boot:run
   ```

4. Access the application:
   Open `http://localhost:8089` in your web browser.


