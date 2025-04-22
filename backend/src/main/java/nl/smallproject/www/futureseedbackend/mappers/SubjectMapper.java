package nl.smallproject.www.futureseedbackend.mappers;

import nl.smallproject.www.futureseedbackend.dtos.SubjectOutputDto;
import nl.smallproject.www.futureseedbackend.models.Subject;
import org.springframework.stereotype.Component;

@Component
public class SubjectMapper {
    public SubjectOutputDto subjectEntityToOutputDto(Subject subject) {
        SubjectOutputDto subjectOutputDto = new SubjectOutputDto();
        subjectOutputDto.setId(subject.getId());
        subjectOutputDto.setName(subject.getName());
        subjectOutputDto.setDescription(subject.getDescription());
        subjectOutputDto.setTopics(subject.getTopics());
        return subjectOutputDto;
    }
}
