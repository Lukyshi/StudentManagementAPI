package service;

import model.Student;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

import java.util.List;

@Service // mark as a service class
public class StudentService { // business logic

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student saveStudent(Student student) {
        // call jpa from repository
        return repository.save(student);
    }

    public List<Student> getAllStudent() {
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }

}
