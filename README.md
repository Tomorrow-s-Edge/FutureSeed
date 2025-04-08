# **FutureSeed Project - School Management System (Backend)**
Welcome to the FutureSeed project, a comprehensive school management system backend that helps manage various aspects of school administration. The system allows administrators, teachers, students, and parents to interact with the platform to manage classes, students, grades, attendance, and more.

## **Table of Contents**
1. [Introduction](#introduction)

2. [Features](#features)

3. [Tech Stack](#tech-stack)

4. [Installation](#installation)

5. [Configuration](#configuration)

6. [Usage](#usage)

7. [API Endpoints](#api-endpoints)

8. [Testing](#testing)

9. [Contributing](#contributing)

10. [License](#license)

11. [Acknowledgments](#acknowledgements)

---

## **Introduction**
FutureSeed is designed to streamline the operations of a school by providing a backend API that connects different users (students, teachers, parents, and administrators) to an efficient and secure platform. From class scheduling to grade management, FutureSeed aims to enhance the experience of everyone involved in the school ecosystem.

This project focuses solely on the backend of the system. The frontend can be developed separately or integrated with any UI technology of choice.

---

## **Features**
The FutureSeed backend includes the following features:

- **User Management**: Admin, Teacher, Student, and Parent roles with different permissions.

- **Class Management**: Allows teachers to manage courses, assign classes to students, and track performance.

- **Student Enrollment**: Students can enroll in available classes, view grades, and track progress.

- **Attendance Tracking**: Teachers can mark attendance for each class session, and students can view attendance history.

- **Grading System**: Teachers can create assignments, grade them, and provide feedback. Students can view their grades.

- **Notifications**: Automated notifications for students, teachers, and parents about grades, assignments, and attendance updates.

- **Reporting**: Generate reports for class performance, student grades, and attendance.

- **Authentication & Authorization**: Secure login with role-based access control (RBAC) and JWT authentication.

- **API Documentation**: Auto-generated documentation for easy API consumption.

---

## **Tech Stack**
The FutureSeed project uses the following technologies:

Backend Framework:

- Java Springboot (Java-based)

Database:

- PostgreSQL

Authentication:

- JWT (JSON Web Token)

- Spring Boot REST Framework

ORM:

- Hibernate ORM

Environment Management:

- application.properties or application.yml

Testing:

- JUnit

Version Control:

- Git

CI/CD:

- GitHub Actions

---

## **Configuration**
Before running the application, you may need to modify some configurations:

- **Database Configuration**: Ensure your database URL and credentials in .env are correct for your local or production database.

- **JWT Token Secret**: Make sure the JWT_SECRET_KEY is set in .env for secure token signing.

- **Email Backend (Optional)**: If you plan to send emails (e.g., for notifications or password reset), configure an email service in settings.py.

---

## **Usage**
To run the project locally, use the following command:

bash
```
mvn spring-boot:run
```

By default, the server will be available at http://127.0.0.1:8000/.

---


## **API Endpoints**
The backend exposes various API endpoints for managing the school system. Below is a high-level overview of some of the major endpoints.

**Authentication**
- POST /api/auth/register/ - Register a new user.

- POST /api/auth/login/ - Log in and obtain a JWT token.

- POST /api/auth/logout/ - Log out and invalidate the JWT token.

**Users**
- GET /api/users/me/ - Get current logged-in user details.

- GET /api/users/{id}/ - Get user details by ID.

- PUT /api/users/{id}/ - Update user details.

**Students**
- GET /api/students/ - Get a list of all students.

- POST /api/students/ - Create a new student record.

- GET /api/students/{id}/ - Get details of a specific student.

- PUT /api/students/{id}/ - Update student information.

**Teachers**
- GET /api/teachers/ - Get a list of all teachers.

- POST /api/teachers/ - Create a new teacher record.

**Courses**
- GET /api/courses/ - Get a list of all courses.

- POST /api/courses/ - Create a new course.

- GET /api/courses/{id}/ - Get details of a specific course.

**Grades**
- GET /api/grades/ - Get all grades.

- POST /api/grades/ - Add new grades for a student.

For a full list of available endpoints, please refer to the API Documentation.

---

## **Testing**
To run tests for this project:

1. Ensure your virtual environment is activated.

2. Run the tests using the following command:

bash
```
pytest
```

This will execute all tests defined in the tests directory.

---

## **Contributing**
We welcome contributions to the FutureSeed project! If you'd like to contribute, follow these steps:

1. Fork the repository.

2. Create a new branch (git checkout -b feature-name).

3. Make your changes and commit them (git commit -am 'Add new feature').

4. Push to your branch (git push origin feature-name).

5. Open a Pull Request describing your changes.

---

## **License**
This project is licensed under the MIT License - see the LICENSE file for details.


---

## **Acknowledgments**
- Springboot for the robust framework.

- Spring REST Framework for building the API.

- PostgreSQL for the database.

- JWT for secure token-based authentication.

- Open-source community for their contributions to this amazing tech stack.

---

## **Folder Structure - Backend**

```bash
my-backend-project/
│
├── src/
│   ├── main/
│   │   ├── java/                         # Main Java source code
│   │   │   └── com/
│   │   │       └── futureseed/            # Your root package
│   │   │           ├── controller/        # Controllers for handling API requests
│   │   │           ├── dto/              # Data Transfer Objects (DTOs) for API responses
│   │   │           ├── exception/         # Custom exceptions and exception handlers
│   │   │           ├── model/             # Models representing your database entities
│   │   │           ├── repository/        # Repositories for data access (usually extends JpaRepository)
│   │   │           ├── service/           # Service layer for business logic
│   │   │           ├── config/            # Configuration classes (Security, Swagger, etc.)
│   │   │           ├── util/              # Utility classes (e.g., file handling, validations, etc.)
│   │   │           ├── security/          # Security-related files (JWT, Authentication)
│   │   │           └── Application.java   # Entry point (Spring Boot main class)
│   │   │
│   │   ├── resources/
│   │   │   ├── application.properties     # Main configuration file for Spring Boot
│   │   │   ├── static/                   # Static resources (images, stylesheets, etc.)
│   │   │   ├── templates/                # Templates if using Thymeleaf (not common in APIs)
│   │   │   └── db/                       # Database migration files (Liquibase, Flyway)
│   │   │
│   │   ├── webapp/                       # Contains web-related content (if using servlet container)
│   │   │   └── WEB-INF/                  # Web application configuration files (if needed)
│   │   │
│   ├── test/                             # Unit and integration tests
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── futureseed/
│   │   │           ├── controller/        # Tests for controllers
│   │   │           ├── service/           # Tests for services
│   │   │           ├── repository/        # Tests for repositories
│   │   │           ├── model/             # Tests for models (entities)
│   │   │           ├── config/            # Tests for configuration classes
│   │   │           └── ApplicationTests.java  # Main class for integration tests
│   │   │
│   │   ├── resources/
│   │   │   └── application-test.properties  # Configuration for testing environments
│   │   │
│
├── .gitignore                            # Git ignore file to exclude unnecessary files from version control
├── README.md                             # Project overview and instructions
├── pom.xml                               # Maven build file (or `build.gradle` if using Gradle)
├── docker-compose.yml                    # Docker configuration for multi-container apps
├── Dockerfile                            # Dockerfile for creating the app image
├── .env                                   # Environment variables (for local development)
└── .idea/                                # IDE-specific files (can be excluded from version control)

```

detailed explanation: https://dev.to/imajenasyon/folder-structure-backend-java-2402