package nl.smallproject.www.futureseedbackend.models;

import jakarta.persistence.Entity;

import java.util.List;

@Entity(name = "subjects")
public class Subject extends BaseObject{
    private String name;
    private String description;
    private List<String> topics;

    public Subject() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }
}
