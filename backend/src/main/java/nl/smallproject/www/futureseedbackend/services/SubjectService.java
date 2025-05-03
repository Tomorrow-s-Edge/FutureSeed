package nl.smallproject.www.futureseedbackend.services;

import jakarta.transaction.Transactional;
import nl.smallproject.www.futureseedbackend.dtos.subject.SubjectInputOrUpdateDto;
import nl.smallproject.www.futureseedbackend.dtos.subject.SubjectOutputDto;
import nl.smallproject.www.futureseedbackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.futureseedbackend.mappers.SubjectMapper;
import nl.smallproject.www.futureseedbackend.models.Subject;
import nl.smallproject.www.futureseedbackend.repositories.SubjectRepository;
import org.springframework.beans.BeanUtils;
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
    public Subject createSubject(SubjectInputOrUpdateDto subjectInputOrUpdateDto) {
        Subject subject = subjectMapper.subjectInputOrUpdateDtoToEntity(subjectInputOrUpdateDto);
        subjectRepository.save(subject);
        return subject;
    }

    @Transactional
    public void updateSubject(String id, SubjectInputOrUpdateDto subjectUpdateDto) {
        Subject existingSubject = subjectRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Subject not found with this id: " + id));

        Subject updatedSubject = subjectMapper.subjectInputOrUpdateDtoToEntity(subjectUpdateDto);
        BeanUtils.copyProperties(updatedSubject, existingSubject, "id");
        subjectRepository.save(existingSubject);
    }

    @Transactional
    public void deleteSubject(String id) {
        subjectRepository.deleteById(id);
    }
}
