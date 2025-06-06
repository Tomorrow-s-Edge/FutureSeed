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
import java.util.Optional;
import java.util.UUID;

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
            subjectOutputDtos.add(subjectMapper.toDto(subject));
        }
        return subjectOutputDtos;
    }


    public SubjectOutputDto getSubjectById(UUID id) {
        Optional<Subject> subjectOptional = Optional.ofNullable(subjectRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Subject not found with this id: " + id)));

        if (subjectOptional.isPresent()) {
            Subject subject = subjectOptional.get();
            return subjectMapper.toDto(subject);
        } else {
            throw new RecordNotFoundException("Subject not found with this id: " + id);
        }
    }


    @Transactional
    public Subject createSubject(SubjectInputOrUpdateDto subjectInputOrUpdateDto) {
        Subject subject = subjectMapper.toEntity(subjectInputOrUpdateDto);
        subjectRepository.save(subject);
        return subject;
    }

    @Transactional
    public void updateSubject(UUID id, SubjectInputOrUpdateDto subjectUpdateDto) {
        Subject existingSubject = subjectRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Subject not found with this id: " + id));

        Subject updatedSubject = subjectMapper.toEntity(subjectUpdateDto);
        BeanUtils.copyProperties(updatedSubject, existingSubject, "id");
        subjectRepository.save(existingSubject);
    }

    @Transactional
    public void deleteSubject(UUID id) {
        subjectRepository.deleteById(id);
    }
}