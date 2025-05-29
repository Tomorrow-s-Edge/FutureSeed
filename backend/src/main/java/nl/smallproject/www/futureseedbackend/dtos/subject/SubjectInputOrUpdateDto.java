package nl.smallproject.www.futureseedbackend.dtos.subject;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SubjectInputOrUpdateDto {
    private String name;
    private String description;
    private List<String> topics;
}
