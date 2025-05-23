package nl.smallproject.www.futureseedbackend.repositories;

import nl.smallproject.www.futureseedbackend.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, String> {
}
