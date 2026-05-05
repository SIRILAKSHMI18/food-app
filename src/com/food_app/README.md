# 🍔 Food Ordering System (JDBC Project)

## 📌 Description

This project is a simple Food Ordering System built using Java (JDBC) and MySQL. It allows users to register, login, place food orders, and simulate payments.

---

# 📄 Product Requirement Document (PRD)

## 🎯 Objective

To build a simple application that enables users to order food online efficiently.

## ❓ Why are we building this?

* To reduce manual food ordering
* To provide convenience to users
* To demonstrate database connectivity using JDBC

## ⚙️ What does the system do?

* Allows user registration and login
* Displays available food items
* Enables users to place orders
* Simulates payment process

## 💡 How it helps users?

* Saves time
* Easy access to food menu
* Simple and quick ordering process

---

# 🚀 Modules

### 1. User Registration

* Stores user details in database

### 2. Login Authentication

* Verifies user credentials

### 3. Order Food

* Allows users to select food and place orders

### 4. Payment Simulation

* Simulates payment success

---

# 🛠️ Technologies Used

* Java
* JDBC
* MySQL
* Eclipse IDE

---

# 🗄️ Database Design

## 📊 Tables

### 🔹 1. Users Table

* id (Primary Key)
* name
* email
* password

### 🔹 2. Food Table

* id (Primary Key)
* name
* price

### 🔹 3. Orders Table

* id (Primary Key)
* user_id (Foreign Key → Users.id)
* food_id (Foreign Key → Food.id)
* quantity

### 🔹 4. Payments Table

* id (Primary Key)
* order_id (Foreign Key → Orders.id)
* amount
* status (SUCCESS / FAILED)

---

# 🔗 Relationships

* One user can place multiple orders
* One food item can be included in multiple orders
* Each order has one associated payment
* Payments are linked to orders

👉 Relationship types:

* Users → Orders → One-to-Many
* Food → Orders → One-to-Many
* Orders → Payments → One-to-One

---

# ▶️ How to Run

1. Start MySQL
2. Create database:

   ```
   CREATE DATABASE food_app;
   ```
3. Create required tables
4. Update DBConnection with credentials
5. Run:

   * RegisterUser.java
   * LoginUser.java
   * OrderFood.java
   * Payment.java

---

# 📸 Output (Demo)

* User Registered ✅
* Login Successful ✅
* Order Placed ✅
* Payment Successful ✅

---

# 👩‍💻 Siri Lakshmi Marugani

Sirilakshmi Marugani
