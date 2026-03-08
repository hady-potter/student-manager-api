# Student Manager API

A simple RESTful API built with **Spring Boot** for managing student records.
The project demonstrates basic backend development concepts including CRUD operations, validation, DTO usage, and global exception handling.

The application currently uses an **in-memory data store (Map)** instead of a database.

---

## 🚀 Features

* Create a new student
* Retrieve all students
* Retrieve a student by ID
* Update student information
* Delete a student
* Request validation using Jakarta Validation
* Global exception handling
* Feature-based project organization

---

## 🛠️ Technologies Used

* Java 17+
* Spring Boot
* Maven
* Lombok
* Jakarta Validation
* REST API

---

## 📂 Project Structure

The project follows a **feature-based structure** where all student-related components are grouped in a single package.

```
student-manager-api
│
└── src/main/java/com/potter/studentmanager
    │
    ├── student
    │   ├── Student.java
    │   ├── StudentDto.java
    │   ├── StudentRepository.java
    │   ├── StudentService.java
    │   └── StudentController.java
    │
    ├── exception
    │   ├── StudentNotFoundException.java
    │   └── GlobalExceptionHandler.java
    │
    └── StudentManagerApplication.java
```

This approach keeps **all logic related to the Student feature in one place**, making the code easier to navigate in small projects.

---

## 📡 API Endpoints
#### localhost:8080/app

| Method | Endpoint         | Description        |
| ------ | ---------------- | ------------------ |
| GET    | `/students`      | Get all students   |
| GET    | `/students/{id}` | Get student by ID  |
| POST   | `/students`      | Create new student |
| PUT    | `/students/{id}` | Update student     |
| DELETE | `/students/{id}` | Delete student     |

---

## 📥 Example Request

### Create Student

**POST /students**

```json
{
  "name": "Ahmed Ali",
  "email": "ahmed@example.com",
  "gender": "Male"
}
```

---

## 📚 Purpose

This project was built to practice:

* Spring Boot fundamentals
* REST API development
* DTO usage
* Validation
* Exception handling
* Git and GitHub workflow

---

## 📄 License

This project is intended for **learning purposes**.
