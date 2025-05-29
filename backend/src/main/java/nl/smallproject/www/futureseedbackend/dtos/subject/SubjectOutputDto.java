package nl.smallproject.www.futureseedbackend.dtos.subject;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class SubjectOutputDto {
    private UUID id;
    private String name;
    private String description;
    private List<String> topics;
}
