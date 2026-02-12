package controller;

import model.Student;
import org.springframework.web.bind.annotation.*;
import service.StudentService;
import java.util.List;

@RestController // mark this as rest controller
@RequestMapping("/api/students") //  endpoints url
public class StudentController { // receives HTTP req

    private final StudentService service;

    public StudentController (StudentService service) {
        this.service = service;
    }

    // create student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        // request body converts our json to object
        return service.saveStudent(student);
    }

    // read all students
    @GetMapping
    public List<Student> getAllStudent() {
        return service.getAllStudent();
    }

    // read student by id
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) { // path variable reads id from url
        return service.getStudentById(id);
    }

    // update student
    @PutMapping("/{id}")
    public Student UpdateStudent(
            @PathVariable Long id,
            @RequestBody Student student) {
        // set id to jpa knows this is an update
        student.setId(id);
        return service.saveStudent(student);
    }

    // delete student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }



}
