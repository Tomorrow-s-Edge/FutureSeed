package nl.smallproject.www.futureseedbackend;

import nl.smallproject.www.futureseedbackend.models.Subject;
import nl.smallproject.www.futureseedbackend.repositories.SubjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@ActiveProfiles("test")
class FutureSeedBackendApplicationTests {


    @Autowired
    private SubjectRepository subjectRepository;

    @Test
    void contextLoads() {
        // Verifies that the Spring Application Context starts without errors
        assertThat(subjectRepository).isNotNull();
    }

    @Test
    void shouldSaveAndRetrieveEntity() {
        // Sample test to insert and fetch an entity
        Subject entity = new Subject();
        entity.setName("Test Name");
        subjectRepository.save(entity);

        Optional<Subject> found = subjectRepository.findById(entity.getId());

        assertThat(found).isPresent();
        assertThat(found.get().getName()).isEqualTo("Test Name");
    }
}
