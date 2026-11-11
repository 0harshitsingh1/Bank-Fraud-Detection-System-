Bank-Fraud-Detection-System
Project Overview
The Bank Fraud Detection System is an enterprise-grade, distributed microservices application built with Spring Boot and Spring Cloud. Designed to address the increasing sophistication of financial crimes, this system monitors, analyzes, and evaluates financial transactions in real-time. By segmenting core banking functions into decoupled microservices, it ensures high availability, fault isolation, independent scalability, and secure routing across the entire banking pipeline.

Complete Architecture & Microservices Detail
The application is structured into several specialized services that communicate seamlessly to process transactions securely:

API Gateway (api-gateway)

Acts as the single entry point for all incoming client traffic.

Handles centralized request routing, security and authorization filters, rate limiting, and load balancing across downstream microservices.

Account Service (account-service)

Manages customer profile information, bank account statuses, and balance checks.

Exposes APIs for opening accounts, verifying account standing, and updating states securely.

Transaction Service (transaction-service)

Captures, logs, and tracks all financial transactions initiated by users.

Maintains comprehensive historical logs of every transfer or deposit request for audit and compliance trails.

Payment Service (payment-service)

Executes secure fund transfers between accounts.

Coordinates execution handoffs with the transaction and fraud detection layers before funds are finally settled.

Fraud Detection Service (fraud-detection-service)

The core analytical engine of the platform.

Evaluates incoming transactions against predefined risk criteria, historical patterns, and velocity checks to catch and flag suspicious behavior instantaneously.

Notifications Service (notifications-service)

Dispatches alerts, warnings, and receipts (via SMS, email, or push notifications) to users and system administrators.

Triggers immediately upon the detection of high-risk transactions or successful financial operations.

Detailed Features & Capabilities
Real-Time Fraud Evaluation: Automated rule-based analysis that inspects transaction payloads immediately, allowing high-risk transfers to be blocked or held for manual review before completion.

Decoupled Microservices Design: Independent services prevent system-wide bottlenecks; if one component experiences heavy load, only that specific service scales.

Centralized API Routing: Security policies, endpoint routing rules, and cross-cutting concerns are managed uniformly at the Gateway level.

Robust Transaction Lifecycle Tracking: Full visibility into transactions from the moment of initiation through payment processing, fraud screening, and final notification delivery.

Containerized Deployment: Orchestrated using Docker Compose to instantly spin up all microservices and their networking dependencies with a single command.

Tech Stack
Programming Language: Java (100%)

Frameworks & Ecosystem:

Spring Boot

Spring Cloud (for distributed microservices coordination)

Spring Cloud Gateway (for API routing)

Containerization: Docker, Docker Compose

Build Tools: Maven / Gradle

Version Control: Git & GitHub
