# 🗂️ Task Manager Backend

A RESTful backend application built with Spring Boot that allows users to manage tasks through CRUD operations.

---

## 🚀 Features

* Create tasks
* Update tasks
* Delete tasks
* Retrieve all tasks
* Global exception handling
* RESTful API design
* In-memory database using H2

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **H2 Database**
* **Maven**

---

## 📌 API Endpoints

### 🔹 Create Task

POST /tasks

```json
{
  "title": "Complete assignment",
  "description": "Finish Spring Boot project",
  "status": "PENDING"
}
```

---

### 🔹 Get All Tasks

GET /tasks

---

### 🔹 Update Task

PUT /tasks/{id}

```json
{
  "title": "Updated task",
  "description": "Updated description",
  "status": "COMPLETED"
}
```

---

### 🔹 Delete Task

DELETE /tasks/{id}

---

## 🧪 API Testing

Detailed API test cases are available in the `api-tests.http` file.

---

## 🗄️ Database (H2 Console)

Access H2 console:

http://localhost:8080/h2-console

**Default Configuration:**

* JDBC URL: `jdbc:h2:mem:test`

---

## ⚠️ Current Limitations

* No authentication (open APIs)
* Data resets on application restart
* No pagination or filtering
* Basic validation only

---

## 🔜 Future Enhancements

* Integrate authentication system (JWT)
* Connect with auth-system-backend
* Switch to MySQL/PostgreSQL
* Add pagination and filtering
* Improve validation and error handling

---

## ⚙️ Setup & Run

```bash
git clone https://github.com/YOUR_USERNAME/task-manager-backend.git
cd task-manager-backend
mvn spring-boot:run
```

---

## 🎯 Purpose

This project is part of my backend development journey, focused on building REST APIs and understanding CRUD operations using Spring Boot.

---
