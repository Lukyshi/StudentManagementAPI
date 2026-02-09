package repository;

import model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


// database access
// handles all database operations
public interface StudentRepository extends JpaRepository<Student, Long> {
    

}
