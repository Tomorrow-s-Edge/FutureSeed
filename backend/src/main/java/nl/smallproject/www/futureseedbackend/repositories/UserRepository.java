package nl.smallproject.www.futureseedbackend.repositories;

import nl.smallproject.www.futureseedbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
