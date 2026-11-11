# Bank Fraud Detection System

An enterprise-grade, distributed microservices banking application built with **Spring Boot** and **Spring Cloud**, designed to monitor, analyze, and detect fraudulent financial transactions in real-time.

---

## 🏗️ Architecture & Microservices

The application follows a decoupled microservices pattern to ensure fault isolation, high availability, and independent scalability:

* **`api-gateway`**: Acts as the single entry point for all client traffic, handling centralized routing, security filters, rate-limiting, and load balancing.
* **`account-service`**: Manages customer profiles, account standings, and balance verification.
* **`transaction-service`**: Captures, logs, and tracks all financial transactions initiated across the platform for audit and compliance trails.
* **`payment-service`**: Executes secure fund transfers and coordinates transactional handoffs.
* **`fraud-detection-service`**: The core analytical engine that evaluates incoming transaction payloads against predefined rules, velocity checks, and risk patterns to flag suspicious activities instantaneously.
* **`notifications-service`**: Dispatches automated real-time alerts and receipts (via SMS/Email) to users and administrators upon detecting high-risk or successful transactions.

---

## 🚀 Key Features & Capabilities

* **Real-Time Fraud Evaluation:** Automated rule-based inspection that immediately intercepts and flags high-risk transfers before completion.
* **Decoupled Microservices Design:** Prevents system-wide bottlenecks, allowing individual services to scale independently under heavy load.
* **Centralized API Routing:** Unified management of cross-cutting concerns, security policies, and endpoint routing.
* **Containerized Deployment:** Fully orchestrated using **Docker Compose** to instantly spin up the entire multi-service ecosystem.

---

## 🛠️ Tech Stack

* **Language:** Java
* **Frameworks:** Spring Boot, Spring Cloud, Spring Cloud Gateway
* **Containerization:** Docker & Docker Compose
* **Build Tools:** Maven / Gradle
* **Version Control:** Git & GitHub

---

## ⚙️ Getting Started & Installation

### Prerequisites
* JDK 17+ or compatible
* Maven / Gradle
* Docker & Docker Compose

### Running Locally with Docker Compose
Clone the repository and spin up the complete microservices stack with a single command:

```bash
git clone [https://github.com/0harshitsingh1/Bank-Fraud-Detection-System-.git](https://github.com/0harshitsingh1/Bank-Fraud-Detection-System-.git)
cd Bank-Fraud-Detection-System-
docker-compose up --build
