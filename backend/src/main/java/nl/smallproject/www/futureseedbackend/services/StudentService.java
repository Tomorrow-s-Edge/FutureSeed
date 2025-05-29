package nl.smallproject.www.futureseedbackend.services;

import jakarta.transaction.Transactional;
import nl.smallproject.www.futureseedbackend.dtos.student.StudentInputOrUpdateDto;
import nl.smallproject.www.futureseedbackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.futureseedbackend.mappers.StudentMapper;
import nl.smallproject.www.futureseedbackend.models.Student;
import nl.smallproject.www.futureseedbackend.models.User;
import nl.smallproject.www.futureseedbackend.repositories.StudentRepository;
import nl.smallproject.www.futureseedbackend.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final UserRepository userRepository;

    public StudentService(StudentRepository studentRepository, StudentMapper studentMapper, UserRepository userRepository) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
        this.userRepository = userRepository;
    }

    @Transactional
    public Student createStudent(StudentInputOrUpdateDto studentInputDto) {
        User user = userRepository.findById(studentInputDto.getUserId())
                .orElseThrow(() -> new RecordNotFoundException("User not found with this id: " + studentInputDto.getUserId()));

        Student student = studentMapper.toEntity(studentInputDto, user);
        studentRepository.save(student);
        return student;
    }
}
