package nl.smallproject.www.futureseedbackend.services;

import jakarta.transaction.Transactional;
import nl.smallproject.www.futureseedbackend.dtos.SubjectInputDto;
import nl.smallproject.www.futureseedbackend.dtos.SubjectOutputDto;
import nl.smallproject.www.futureseedbackend.mappers.SubjectMapper;
import nl.smallproject.www.futureseedbackend.models.Subject;
import nl.smallproject.www.futureseedbackend.repositories.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;
    private final SubjectMapper subjectMapper;

    public SubjectService(SubjectRepository subjectRepository, SubjectMapper subjectMapper) {
        this.subjectRepository = subjectRepository;
        this.subjectMapper = subjectMapper;
    }

    public List<SubjectOutputDto> getAllSubjects() {
        List<Subject> subjects = subjectRepository.findAll();
        List<SubjectOutputDto> subjectOutputDtos = new ArrayList<>();
        for (Subject subject : subjects) {
            subjectOutputDtos.add(subjectMapper.subjectEntityToOutputDto(subject));
        }
        return subjectOutputDtos;
    }

    @Transactional
    public Subject createSubject(SubjectInputDto subjectInputDto) {
        Subject subject = subjectMapper.subjectInputDtoToEntity(subjectInputDto);
        subjectRepository.save(subject);
        return subject;
    }
}
