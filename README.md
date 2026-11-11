# Bank Fraud Detection System

An enterprise-grade, distributed microservices banking application built with **Spring Boot**, **Spring Cloud**, and **Apache Kafka**, designed to monitor, analyze, and detect fraudulent financial transactions in real-time through event-driven streaming.

---

## 🏗️ Architecture & Microservices

The application follows a decoupled event-driven microservices pattern to ensure fault isolation, high availability, and independent scalability:

* **`api-gateway`**: Acts as the single entry point for all client traffic, handling centralized routing, security filters, rate-limiting, and load balancing.
* **`account-service`**: Manages customer profiles, account standings, and balance verification.
* **`transaction-service`**: Captures, logs, and tracks all financial transactions initiated across the platform, publishing transaction events directly to Kafka topics.
* **`payment-service`**: Executes secure fund transfers and coordinates asynchronous transactional handoffs.
* **`fraud-detection-service`**: The core real-time analytical engine that consumes transaction streams from Kafka, evaluating payloads against predefined rules, velocity checks, and risk patterns to flag suspicious activities instantaneously.
* **`notifications-service`**: Subscribes to event topics to dispatch automated real-time alerts and receipts (via SMS/Email) to users and administrators upon detecting high-risk or successful transactions.

---

## 🚀 Key Features & Capabilities

* **Real-Time Event Streaming:** Leverages Apache Kafka to stream transactions asynchronously between services with ultra-low latency.
* **Real-Time Fraud Evaluation:** Automated rule-based inspection that immediately intercepts and flags high-risk transfers before completion.
* **Decoupled Microservices Design:** Prevents system-wide bottlenecks, allowing individual services to scale independently under heavy load.
* **Centralized API Routing:** Unified management of cross-cutting concerns, security policies, and endpoint routing.
* **Containerized Deployment:** Fully orchestrated using **Docker Compose** to instantly spin up the entire multi-service ecosystem alongside Kafka and ZooKeeper.

---

## 🛠️ Tech Stack

* **Language:** Java
* **Frameworks & Core:** Spring Boot, Spring Cloud, Spring Cloud Gateway
* **Event Streaming:** Apache Kafka & ZooKeeper
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
Clone the repository and spin up the complete microservices stack along with Kafka using a single command:

```bash
git clone [https://github.com/0harshitsingh1/Bank-Fraud-Detection-System-.git](https://github.com/0harshitsingh1/Bank-Fraud-Detection-System-.git)
cd Bank-Fraud-Detection-System-
docker-compose up --build
