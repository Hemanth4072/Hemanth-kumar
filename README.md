# Student Management System (Spring Boot + Java + SQL)

A simple CRUD API for managing students using:
- Spring Boot
- Java 17
- Spring Data JPA
- H2 SQL Database

## Progress Log

### Day 2 Update
- Added a project progress section to track daily work.
- Documented H2 database console access for easier local debugging.

## Run the app

```bash
mvn spring-boot:run
```

The app starts at: `http://localhost:8080`

### H2 Console

- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: *(leave blank)*

## Student CRUD APIs

Base URL: `http://localhost:8080/api/students`

### 1) Create Student
```bash
curl -X POST http://localhost:8080/api/students \
  -H "Content-Type: application/json" \
  -d '{"name":"Hemanth","email":"hemanth@example.com","course":"Java"}'
```

### 2) Get All Students
```bash
curl http://localhost:8080/api/students
```

### 3) Get Student By ID
```bash
curl http://localhost:8080/api/students/1
```

### 4) Update Student
```bash
curl -X PUT http://localhost:8080/api/students/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"Hemanth Kumar","email":"hemanth.kumar@example.com","course":"Spring Boot"}'
```

### 5) Delete Student
```bash
curl -X DELETE http://localhost:8080/api/students/1
```

