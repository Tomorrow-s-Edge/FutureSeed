package nl.smallproject.www.futureseedbackend.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "subjects")
public class Subject extends BaseObject{
    private String name;
    private String description;
    private List<String> topics;

    public Subject() {
        super();
    }
}
