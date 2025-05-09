package nl.smallproject.www.futureseedbackend.dtos.subject;

import java.util.List;

public class SubjectInputOrUpdateDto {
    private String name;
    private String description;
    private List<String> topics;

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
