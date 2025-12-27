# 📦 Product Inventory Management System (Spring Boot)

## 📌 Project Overview
This is a **Spring Boot REST API** for managing products in an inventory system.  
The application provides basic **CRUD operations** such as adding, retrieving, updating, and deleting products.
This project is built to demonstrate:
- Spring Boot fundamentals
- RESTful API design
- Layered architecture (Controller, Service, Model)
- Clean backend structure used in software houses
## 🚀 Features
- Add a new product  
- Get all products  
- Get product by ID  
- Update product details  
- Delete a product  
## 🛠️ Technology Stack
- Java  
- Spring Boot  
- Spring Web (REST API)  
- Spring Data JPA  
- H2 / MySQL Database  
- Maven  
## 📂 Project Structure

---

## 🧠 Architecture Explanation
- **Controller Layer**  
  Handles incoming HTTP requests and sends responses.

- **Service Layer**  
  Contains business logic and interacts with the repository.

- **Model Layer**  
  Represents the Product entity mapped to the database.

This layered architecture improves code readability, scalability, and maintainability.

---

## 📌 API Endpoints

| HTTP Method | Endpoint                 | Description              |
|------------|--------------------------|--------------------------|
| POST       | `/product/add`           | Add new product          |
| GET        | `/product/get`           | Get all products         |
| GET        | `/product/get/{id}`      | Get product by ID        |
| PUT        | `/product/update/{id}`   | Update product           |
| DELETE     | `/product/delete/{id}`   | Delete product           |

---

## ▶️ How to Run the Project

### ✅ Prerequisites
- Java JDK 8 or above  
- Maven  
- IDE (IntelliJ IDEA / Eclipse / VS Code)

---

### 🧩 Steps to Run

#### 1️⃣ Clone the repository
```bash
git clone <repository-url>
