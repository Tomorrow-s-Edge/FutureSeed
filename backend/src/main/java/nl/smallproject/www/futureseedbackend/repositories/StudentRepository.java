package nl.smallproject.www.futureseedbackend.repositories;

import nl.smallproject.www.futureseedbackend.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
