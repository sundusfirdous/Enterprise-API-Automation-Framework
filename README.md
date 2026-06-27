# Enterprise API Automation Framework

![CI](https://github.com/sundusfirdous/Enterprise-API-Automation-Framework/actions/workflows/api-ci.yml/badge.svg)

![Java](https://img.shields.io/badge/Java-17-orange)
![Maven](https://img.shields.io/badge/Maven-3.x-red)
![REST Assured](https://img.shields.io/badge/REST%20Assured-5.5.0-green)
![TestNG](https://img.shields.io/badge/TestNG-7.11.0-red)
![GitHub Actions](https://img.shields.io/badge/CI-GitHub%20Actions-blue)

An enterprise-grade REST API Automation Framework built using **Java**, **REST Assured**, **TestNG**, and **Maven**. The framework follows industry-standard design patterns and demonstrates scalable API test automation using the Service Layer Pattern, Builder Pattern, POJO model mapping, authentication, schema validation, data-driven testing, Docker, Postman, Newman, Swagger, and GitHub Actions.

---

# Project Features

* REST Assured API Automation
* Java 17
* Maven Build Management
* TestNG Framework
* CRUD API Testing
* Authentication Testing
* Service Layer Pattern
* Builder Pattern
* POJO Model Mapping (Jackson)
* Data-Driven Testing
* JSON Schema Validation
* Dynamic Test Data (DataFaker)
* Integration Workflow Testing
* Request & Response Logging
* Configuration Management
* Docker Support
* Jenkins Pipeline
* GitHub Actions CI/CD
* Postman Collection
* Newman HTML Reports
* Swagger/OpenAPI Documentation

---

# Technology Stack

| Technology   | Version |
| ------------ | ------- |
| Java         | 17      |
| Maven        | 3.x     |
| REST Assured | 5.5.0   |
| TestNG       | 7.11.0  |
| Jackson      | 2.18.0  |
| Log4j2       | 2.24.1  |
| DataFaker    | 2.4.2   |
| Docker       | Latest  |
| Jenkins      | Latest  |
| Postman      | Latest  |
| Newman       | Latest  |

---

# Project Structure

```text
Enterprise-API-Automation-Framework                                                              
│   .dockerignore
│   pom.xml
│   README.md
│   testng.xml
│   
├───.github
│   └───workflows
│           api-ci.yml
│           
├───Docker
│       Dockerfile
│       
├───Postman
│   ├───Collections
│   │       Enterprise API.postman_collection.json
│   │       
│   ├───Environments
│   │       QA.postman_environment.json
│   │       
│   └───Reports
│           NewmanReport.html
│           
├───Screenshots
│       docker-build.png
│       docker-dashboard.png
│       docker-dashboard2.png
│       docker-dashboard3.png
│       docker-images.png
│       newman-report.png
│       postman-authentication.png
│       postman-create-user.png
│       postman-delete-user.png
│       newman-html-report.png
│       postman-get-user.png
│       postman-login.png
│       postman-update-user.png
│       testcases execution report.png
│       
├───src
│   ├───main
│   │   ├───filters
│   │   │       RequestFilter.java
│   │   │       RequestLoggingFilter.java
│   │   │       ResponseFilter.java
│   │   │       ResponseLoggingFilter.java
│   │   │       
│   │   ├───java
│   │   │   ├───auth
│   │   │   │       TokenManager.java
│   │   │   │       
│   │   │   ├───builders
│   │   │   │       RequestSpecificationBuilder.java
│   │   │   │       ResponseSpecificationBuilder.java
│   │   │   │       
│   │   │   ├───config
│   │   │   │       ConfigManager.java
│   │   │   │       
│   │   │   ├───constants
│   │   │   │       FrameworkConstants.java
│   │   │   │       
│   │   │   ├───endpoints
│   │   │   │       Routes.java
│   │   │   │       
│   │   │   ├───models
│   │   │   │       LoginRequest.java
│   │   │   │       User.java
│   │   │   │       
│   │   │   ├───payloads
│   │   │   │       LoginPayload.java
│   │   │   │       
│   │   │   ├───reports
│   │   │   ├───services
│   │   │   │       AuthService.java
│   │   │   │       BaseService.java
│   │   │   │       UserService.java
│   │   │   │       
│   │   │   └───utils
│   │   │           FakerUtils.java
│   │   │           JsonUtils.java
│   │   │           LoggerUtil.java
│   │   │           
│   │   └───resources
│   │           config.properties
│   │           log4j2.xml
│   │           prod.properties
│   │           qa.properties
│   │           uat.properties
│   │           
│   └───test
│       ├───java
│       │   ├───base
│       │   │       BaseTest.java
│       │   │       
│       │   ├───dataproviders
│       │   │       UserDataProvider.java
│       │   │       
│       │   ├───listeners
│       │   ├───tags
│       │   │       Regression.java
│       │   │       Smoke.java
│       │   │       
│       │   └───tests
│       │       ├───auth
│       │       │       LoginTest.java
│       │       │       
│       │       ├───Integration
│       │       │       UserWorkflowTest.java
│       │       │       
│       │       ├───regression
│       │       │       CreateUserDataDrivenTest.java
│       │       │       DeleteUserTest.java
│       │       │       UpdateUserTest.java
│       │       │       UserSchemaValidationTest.java
│       │       │       
│       │       └───smoke
│       │               CreateUserTest.java
│       │               GetUserTest.java
│       │               
│       └───resources
│           ├───schemas
│           │       user-schema.json
│           │       
│           └───testdata
│                   users.json
│                   
├───Swagger
│       openapi.yaml
│       README.md
│       swagger.json
│       
└───target
    ├───classes
    │   │   config.properties
    │   │   log4j2.xml
    │   │   prod.properties
    │   │   qa.properties
    │   │   uat.properties
    │   │   
    │   ├───auth
    │   │       TokenManager.class
    │   │       
    │   ├───builders
    │   │       RequestSpecificationBuilder.class
    │   │       ResponseSpecificationBuilder.class
    │   │       
    │   ├───config
    │   │       ConfigManager.class
    │   │       
    │   ├───constants
    │   │       FrameworkConstants.class
    │   │       
    │   ├───endpoints
    │   │       Routes.class
    │   │       
    │   ├───models
    │   │       User.class
    │   │       
    │   ├───payloads
    │   │       LoginPayload.class
    │   │       
    │   ├───services
    │   │       AuthService.class
    │   │       BaseService.class
    │   │       UserService.class
    │   │       
    │   └───utils
    │           FakerUtils.class
    │           JsonUtils.class
    │           LoggerUtil.class
    │           
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    ├───maven-status
    │   └───maven-compiler-plugin
    │       ├───compile
    │       │   └───default-compile
    │       │           createdFiles.lst
    │       │           inputFiles.lst
    │       │           
    │       └───testCompile
    │           └───default-testCompile
    │                   createdFiles.lst
    │                   inputFiles.lst
    │                   
    ├───surefire-reports
    │   │   bullet_point.png
    │   │   collapseall.gif
    │   │   emailable-report.html
    │   │   failed.png
    │   │   index.html
    │   │   jquery-3.6.0.min.js
    │   │   navigator-bullet.png
    │   │   passed.png
    │   │   skipped.png
    │   │   TEST-TestSuite.xml
    │   │   testng-reports.css
    │   │   testng-reports.js
    │   │   testng-reports1.css
    │   │   testng-reports2.js
    │   │   testng-results.xml
    │   │   TestSuite.txt
    │   │   
    │   ├───junitreports
    │   │       TEST-tests.auth.LoginTest.xml
    │   │       TEST-tests.integration.UserWorkflowTest.xml
    │   │       TEST-tests.regression.CreateUserDataDrivenTest.xml
    │   │       TEST-tests.regression.DeleteUserTest.xml
    │   │       TEST-tests.regression.UpdateUserTest.xml
    │   │       TEST-tests.regression.UserSchemaValidationTest.xml
    │   │       TEST-tests.smoke.CreateUserTest.xml
    │   │       TEST-tests.smoke.GetUserTest.xml
    │   │       
    │   └───Surefire suite
    │           Surefire test.html
    │           Surefire test.xml
    │           
    └───test-classes
        ├───base
        │       BaseTest.class
        │       
        ├───dataproviders
        │       UserDataProvider.class
        │       
        ├───schemas
        │       user-schema.json
        │       
        ├───tags
        │       Regression.class
        │       Smoke.class
        │       
        ├───testdata
        │       users.json
        │       
        └───tests
            ├───auth
            │       LoginTest.class
            │       
            ├───integration
            │       UserWorkflowTest.class
            │       
            ├───regression
            │       CreateUserDataDrivenTest.class
            │       DeleteUserTest.class
            │       UpdateUserTest.class
            │       UserSchemaValidationTest.class
            │       
            └───smoke
                    CreateUserTest.class
                    GetUserTest.class
```

---

# Framework Architecture

```
Tests
   │
   ▼
Service Layer
   │
   ▼
REST Assured
   │
   ▼
API Server
```

---

# Test Coverage

### Smoke Tests

* Get User
* Create User

### Regression Tests

* Update User
* Delete User
* Schema Validation
* Data-Driven Testing

### Integration Tests

* Complete User Workflow

### Authentication

* Login API

---

# API Endpoints Covered

| API         | Method |
| ----------- | ------ |
| Login       | POST   |
| Get User    | GET    |
| Create User | POST   |
| Update User | PUT    |
| Delete User | DELETE |

---

# Design Patterns Used

* Service Layer Pattern
* Builder Pattern
* POJO Pattern
* Singleton Configuration
* Utility Classes
* Data Provider Pattern

---

# Running the Project

Clone the repository

```bash
git clone https://github.com/sundusfirdous/Enterprise-API-Automation-Framework.git
```

Navigate to the project

```bash
cd Enterprise-API-Automation-Framework
```

Run all tests

```bash
mvn clean test
```

Run TestNG Suite

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

# Docker

Build Docker Image

```bash
docker build -t enterprise-api-framework -f Docker/Dockerfile .
```

Run Docker Container

```bash
docker run enterprise-api-framework
```
---

Run the project using Jenkins Pipeline.

---

# GitHub Actions

Workflow file

```
.github/workflows/api-ci.yml
```

The workflow automatically executes the test suite on every Push and Pull Request.

---

# Postman

Collection

```
Postman/Collections/Enterprise API.postman_collection.json
```

Environment

```
Postman/Environments/QA.postman_environment.json
```

Run using Newman

```bash
newman run "Postman/Collections/Enterprise API.postman_collection.json" -e "Postman/Environments/QA.postman_environment.json"
```

Generate HTML Report

```bash
newman run "Postman/Collections/Enterprise API.postman_collection.json" -e "Postman/Environments/QA.postman_environment.json" -r cli,htmlextra --reporter-htmlextra-export "Postman/Reports/NewmanReport.html"
```
Open HTML Report in Browser

```bash
start .\Postman\Reports\NewmanReport.html
```
---

# Swagger

OpenAPI Specification

```
Swagger/openapi.yaml
```

Swagger JSON

```
Swagger/swagger.json
```

Swagger Documentation

```
Swagger/README.md
```

---

# Reports

### TestNG Reports

```
target/surefire-reports/
```

### Newman HTML Report

```
Postman/Reports/NewmanReport.html
```

---

# Configuration Files

Located in:

```
src/main/resources
```

Files:

* config.properties
* qa.properties
* uat.properties
* prod.properties
* log4j2.xml

---

# Screenshots

Project includes screenshots demonstrating:

* Docker Image Build
* Docker Dashboard
* Postman Login
* Get User
* Create User
* Update User
* Delete User
* Newman HTML Report
* TestNG Execution Report

Located in:

```
Screenshots/
   docker-build.png
    docker-dashboard.png
    docker-dashboard2.png
    docker-dashboard3.png
    docker-images.png
    newman-report.png
    postman-authentication.png
    postman-create-user.png
    postman-delete-user.png
    postman-delete-user2.png
    postman-get-user.png
    postman-login.png
    postman-update-user.png
    testcases execution report.png
```

---

# Future Enhancements

* Allure Reports
* Extent Reports
* Parallel Execution
* Retry Analyzer
* Database Validation
* Contract Testing
* Performance Testing
* Kubernetes Deployment
* Azure DevOps Pipeline

---

# Author

**Sundus Firdous**

Automation Engineer specializing in:

* REST Assured
* Java
* API Automation
* TestNG
* Maven
* Docker
* Jenkins
* GitHub Actions
* Postman
* Newman

GitHub Repository

```
https://github.com/sundusfirdous/Enterprise-API-Automation-Framework
```

---

# License

This project is created for learning, portfolio demonstration, and interview preparation purposes.
