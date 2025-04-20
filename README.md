# Activité Pratique N°2 - ORM JPA Hibernate Spring Data

## Description

This project demonstrates the use of **Object-Relational Mapping (ORM)** principles using JPA (Jakarta Persistence API), Hibernate as the JPA provider, and Spring Data JPA. The focus is on understanding how to design and implement a structured database, interact with it through Java entities, and efficiently manage data in a Spring-based application.

---

## Features Implemented

- **ORM with JPA and Hibernate**:
    - Mapping Java objects to a relational database.
    - Establishing relationships: `@OneToOne`, `@OneToMany`, `@ManyToOne`, and `@ManyToMany`.

- **Spring Data JPA**:
    - Simplified repository interfaces for CRUD operations.
    - Support for paging, sorting, and custom queries using JPQL.

- **Database Transactions**:
    - Ensured data consistency and atomicity with transaction management in Spring.

- **Application Configuration**:
    - Database configuration and Hibernate properties managed via `application.properties`.

- **RESTful Endpoints**:
    - Exposed endpoints for external interaction with the system.

---

## Getting Started

### Prerequisites

1. Install **JDK 22** (or compatible versions).
2. Install **Maven** (for dependency management).
3. Set up a compatible **Relational Database Management System (RDBMS)**.

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd <project-directory>
   ```
3. Configure the project by editing the database credentials in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:<your-database-url>
   spring.datasource.username=<database-username>
   spring.datasource.password=<database-password>
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

4. Build and run the project:
   ```bash
   mvn spring-boot:run
   ```

---

## Example Entity Class

Here's an example of how entities are mapped using JPA annotations:

```java
package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    @ManyToOne
    private Category category;
}
```

---

## Example Repository Interface

Repository interfaces are used to simplify data access:

```java
package com.example.demo.repositories;

import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContaining(String keyword);
}
```

---

## Example REST Controller

The REST controller exposes endpoints to interact with the application:

```java
package com.example.demo.controllers;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
```

---

## Technologies Used

- **Java (Version 22)**: Core programming language.
- **Spring Boot**: Framework for application setup.
- **Spring Data JPA**: Simplifies database access and query construction.
- **Hibernate ORM**: JPA provider for persistence mapping.
- **Maven**: Dependency management.
- **Lombok**: Reduces boilerplate code with annotations (e.g., `@Data`).

---

## Acknowledgments

This project is part of an educational exercise aimed at deepening understanding of modern ORM principles and data management in Java applications. Special thanks to everyone who supported or contributed.
