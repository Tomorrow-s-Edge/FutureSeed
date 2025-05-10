package nl.smallproject.www.futureseedbackend.repositories;

import nl.smallproject.www.futureseedbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
