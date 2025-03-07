# 🎓 Student Management Application

A **Java-based** Student Management System developed using **Spring Boot** and **MySQL** as part of a university internship project at the **Ministry of Finance IT Department**.

This project provides RESTful APIs to manage student records, allowing users to **create, read, update, and delete (CRUD)** student data.

---

## 📌 Project Overview

- **Institution**: Academia de Studii Economice, București  
- **Faculty**: Cybernetics, Statistics, and Economic Informatics  
- **Internship**: Ministry of Finance, IT Department  
- **Supervisor**: Tiberiu Marian Georgescu  
- **Student**: Alexandru Ariton  
- **Year**: 2023  
- **Technologies Used**: Java, Spring Boot, MySQL, Postman, Eclipse IDE  

---

## 🚀 Features

✅ **Student Management** – Create, Read, Update, Delete student records  
✅ **REST API** – Uses HTTP methods for CRUD operations  
✅ **Database Integration** – Stores student data in MySQL  
✅ **Spring Boot Framework** – Implements MVC architecture  
✅ **Postman Testing** – API testing with different HTTP requests  

---

## 🏗️ System Architecture

This project follows the **Spring Boot MVC** architecture:

📂 **Controller** – Manages API requests and responses.  
📂 **Entity** – Defines the `Student` entity mapped to a MySQL database table.  
📂 **Repository** – Provides database operations using Spring Data JPA.  
📂 **Database Configuration** – Connects the application to a MySQL database.  

---

## 📥 Installation & Setup

### 🔹 **Prerequisites**
Ensure you have the following installed:  

- **Java (JDK 11 or higher)**  
- **Eclipse IDE**  
- **Spring Boot Framework**  
- **MySQL Database**  
- **Postman (for API testing)**  

### 🔹 **Installation Steps**
1️⃣ Clone the repository:  
```sh
git clone https://github.com/your-repo/student-management.git
```
2️⃣ Navigate to the project directory:  
```sh
cd student-management
```
3️⃣ Open the project in **Eclipse IDE**.  
4️⃣ Configure the MySQL database connection.  
5️⃣ Run the application as a **Spring Boot Application**.  

---

## 📊 API Endpoints & Usage

### **1️⃣ Create a Student (POST Request)**
```http
POST /api/students
```
**Request Body (JSON):**
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "address": "123 Main Street"
}
```

### **2️⃣ Get All Students (GET Request)**
```http
GET /api/students
```

### **3️⃣ Get a Student by ID (GET Request)**
```http
GET /api/students/{id}
```

### **4️⃣ Update a Student (PUT Request)**
```http
PUT /api/students/{id}
```
**Request Body (JSON):**
```json
{
  "name": "John Updated",
  "email": "john.updated@example.com",
  "address": "456 Updated Street"
}
```

### **5️⃣ Delete a Student (DELETE Request)**
```http
DELETE /api/students/{id}
```

---

## 📊 Database Configuration

To configure **MySQL**, update the `application.properties` file:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---

## 🎯 Future Enhancements

🔮 **Next Steps:**  
- Add **User Authentication & Role Management**.  
- Implement **Frontend UI with React or Angular**.  
- Extend features with **Student Performance Analytics**.  
- Improve **Error Handling & Logging**.  

---

👥 Contributors:  
- **Alexandru Ariton**  

---
