package nl.smallproject.www.futureseedbackend.mappers;

import nl.smallproject.www.futureseedbackend.dtos.subject.SubjectInputOrUpdateDto;
import nl.smallproject.www.futureseedbackend.dtos.subject.SubjectOutputDto;
import nl.smallproject.www.futureseedbackend.models.Subject;
import org.springframework.stereotype.Component;

@Component
public class SubjectMapper {
    public SubjectOutputDto toDto(Subject subject) {
        SubjectOutputDto subjectOutputDto = new SubjectOutputDto();
        subjectOutputDto.setId(subject.getId());
        subjectOutputDto.setName(subject.getName());
        subjectOutputDto.setDescription(subject.getDescription());
        subjectOutputDto.setTopics(subject.getTopics());
        return subjectOutputDto;
    }

    public Subject toEntity(SubjectInputOrUpdateDto subjectInputOrUpdateDto) {
        Subject subject = new Subject();
        subject.setName(subjectInputOrUpdateDto.getName());
        subject.setDescription(subjectInputOrUpdateDto.getDescription());
        subject.setTopics(subjectInputOrUpdateDto.getTopics());
        return subject;
    }
}
