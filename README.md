# 🥷 Ninjas Sign Up API

Welcome to the **Ninjas Sign Up API**!  
This project is a layered architecture application developed with **Spring Boot**, designed to register ninjas and their respective missions. It uses **H2** as an in-memory database, **Flyway** for database versioning, and follows software development best practices such as version control with **Git** and repository hosting on **GitHub**.

This project also includes extra lessons covering relational databases in more depth.

---

## 🧭 Project Overview

This system was built to manage **ninjas and their missions**.

Each ninja can be assigned to **one mission**, while a mission can be assigned to **multiple ninjas**.

### ✅ Features

- Register ninjas with name, age, email, and rank
- Assign a mission to a ninja
- Manage missions and view associated ninjas

---

## 🛠️ Technologies Used

- **Spring Boot** – Web application and dependency management
- **H2 Database** – In-memory database for development and testing
- **Flyway** – Database migration tool
- **JPA (Java Persistence API)** – Object-relational mapping (ORM)
- **Spring Data JPA** – Abstraction layer for database operations
- **Maven** – Build tool and dependency manager
- **Git** – Version control system
- **GitHub** – Source code repository
- **Docker** – External database containerization
- **SQL** – Database query language

---

## 🗂️ Database Design

The database schema includes the following relationships:

- `Ninja`:
    - `id`, `name`, `age`, `email`, `rank`
- `Mission`:
    - `id`, `title`, `description`

### Relationships

- A **ninja** can have **only one mission**
- A **mission** can be assigned to **multiple ninjas**
