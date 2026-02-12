#  Student Management API

A simple RESTful API built using Spring Boot for managing student records.
This project was created for practice and learning purposes and will be improved over time as I continue developing my backend skills.

---

##  Technologies Used

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Maven**
- **RESTful API**
- **Postman** (API Testing)

---

##  Features

-  Create a student  
- Retrieve all students  
- Retrieve a student by ID  
- Update student information  
- Delete a student  
- MySQL database integration  

---

##  API Endpoints

| Method | Endpoint              | Description              |
|--------|----------------------|--------------------------|
| POST   | `/api/students`      | Create a new student     |
| GET    | `/api/students`      | Get all students         |
| GET    | `/api/students/{id}` | Get student by ID        |
| PUT    | `/api/students/{id}` | Update student           |
| DELETE | `/api/students/{id}` | Delete student           |

---

## 🧾 Sample Request Body

```json
{
  "name": "JLuiz Bangsoy",
  "email": "LuizBangsoyn@example.com",
  "program": "Computer Science",
  "id": 1
}
