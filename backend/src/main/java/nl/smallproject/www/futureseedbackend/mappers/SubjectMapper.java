package nl.smallproject.www.futureseedbackend.mappers;

import nl.smallproject.www.futureseedbackend.dtos.SubjectInputDto;
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

    public Subject subjectInputDtoToEntity(SubjectInputDto subjectInputDto) {
        Subject subject = new Subject();
        subject.setName(subjectInputDto.getName());
        subject.setDescription(subjectInputDto.getDescription());
        subject.setTopics(subjectInputDto.getTopics());
        return subject;
    }
}
