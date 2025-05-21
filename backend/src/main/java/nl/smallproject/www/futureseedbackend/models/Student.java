package nl.smallproject.www.futureseedbackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "students")
public class Student extends BaseObject{
    private String studentNumber;
    private String gradeLevel;
    private LocalDateTime enrollmentDate;
    private String classGroup;
    private String guardianName;
    private String guardianContact;

    @OneToOne
    private User user;

    public Student() {
        super();
    }
}
