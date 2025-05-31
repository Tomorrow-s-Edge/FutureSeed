package nl.smallproject.www.futureseedbackend.dtos.student;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class StudentInputOrUpdateDto {
    private String gradeLevel;
    private String classGroup;
    private String guardianName;
    private String guardianContact;

    private UUID userId;
}
