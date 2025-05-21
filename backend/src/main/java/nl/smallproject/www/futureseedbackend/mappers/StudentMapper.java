package nl.smallproject.www.futureseedbackend.mappers;

import nl.smallproject.www.futureseedbackend.dtos.student.StudentInputOrUpdateDto;
import nl.smallproject.www.futureseedbackend.models.Student;
import nl.smallproject.www.futureseedbackend.models.User;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public Student toEntity(StudentInputOrUpdateDto studentInputDto, User user) {
        Student student = new Student();
        student.setGradeLevel(studentInputDto.getGradeLevel());
        student.setClassGroup(studentInputDto.getClassGroup());
        student.setGuardianName(studentInputDto.getGuardianName());
        student.setGuardianContact(studentInputDto.getGuardianContact());
        student.setUser(user);
        return student;
    }
}
