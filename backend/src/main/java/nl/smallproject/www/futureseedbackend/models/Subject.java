package nl.smallproject.www.futureseedbackend.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "subjects")
public class Subject extends BaseObject{
    private String name;
    private String description;
    private List<String> topics;

    public Subject() {
        super();
    }
}
