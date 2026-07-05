# Online Store Application

A modern, robust full-stack web application built with Java and Spring Boot. This application provides a comprehensive platform for managing an online store, featuring product catalog management, a responsive web interface, and a well-structured backend architecture.

## 🌟 Features

- **Product Management:** Full CRUD (Create, Read, Update, Delete) operations for store products.
- **Responsive UI:** Dynamic and responsive frontend built with Thymeleaf templates and modern CSS.
- **Layered Architecture:** Clean separation of concerns using Controllers, Services, and Data Access Objects (Repositories).
- **Database Integration:** Seamless database operations with Spring Data JPA.
- **RESTful Principles:** Structured routing and endpoints for efficient resource management.

## 🛠️ Technology Stack

- **Backend Framework:** [Spring Boot](https://spring.io/projects/spring-boot) (Java)
- **Frontend Template Engine:** [Thymeleaf](https://www.thymeleaf.org/)
- **Data Access:** Spring Data JPA / Hibernate
- **Build Tool:** Maven

## 📁 Project Structure

```text
src/
├── main/
│   ├── java/com/example/onlinestore/
│   │   ├── business/      # Business logic and service layer (Services & Impls)
│   │   ├── dao/           # Data access layer (Entities & Repositories)
│   │   ├── web/           # Web layer (Controllers)
│   │   └── OnlinestoreApplication.java # Application entry point
│   └── resources/
│       ├── application.properties # Configuration file
│       ├── static/                # Static assets (CSS, JS, Images)
│       └── templates/             # Thymeleaf HTML templates (index, list, create, edit)
```

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven 3.6+
- Git

### Installation & Running Locally

1. **Clone the repository:**
   ```bash
   git clone https://github.com/youta935aya-cpu/onlinestore.git
   cd onlinestore
   ```

2. **Build the project:**
   Using the Maven wrapper (Windows):
   ```cmd
   mvnw.cmd clean install
   ```
   Or if you have Maven installed globally:
   ```cmd
   mvn clean install
   ```

3. **Run the application:**
   ```cmd
   mvnw.cmd spring-boot:run
   ```

4. **Access the Application:**
   Open your web browser and navigate to:
   `http://localhost:8080`

## 🤝 Contributing

Contributions, issues, and feature requests are welcome! 
Feel free to check the [issues page](https://github.com/youta935aya-cpu/onlinestore/issues).

## 📝 License

This project is open-source and available under the [MIT License](LICENSE).
