# Enterprise Sales & Analytics Platform (JEE)

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.5-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![React](https://img.shields.io/badge/React-18-61DAFB?style=for-the-badge&logo=react&logoColor=black)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-Enabled-2496ED?style=for-the-badge&logo=docker&logoColor=white)

## 📖 Project Overview

The **Sales Management & Predictive Analytics Platform** is a full-stack JEE application designed to modernize retail inventory and sales tracking. It combines a robust **Spring Boot** backend with a responsive **React** frontend to deliver real-time insights.

Unlike traditional CRUD applications, this platform integrates **Data Science** modules to provide predictive analysis on sales trends, helping managers make data-driven decisions regarding stock and pricing.

---

## 🏗 Architecture

The system follows a microservices-oriented architecture, separating the core business logic from the predictive modeling engine.

```mermaid
graph TD
    User((User)) -->|HTTPS| Frontend[React Client]
    Frontend -->|REST API + JWT| Backend[Spring Boot Core]
    
    subgraph Data Layer
        Backend -->|JPA/Hibernate| DB[(PostgreSQL)]
    end
    
    subgraph Intelligence Layer
        Backend -->|Internal Service| JavaAlgo[Java Prediction Engine]
        Backend -.->|HTTP - Legacy| Python[Python ML Service]
    end
