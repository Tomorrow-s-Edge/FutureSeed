package nl.smallproject.www.futureseedbackend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseObject {

    @Id
    protected String id;

    @Column(name = "created_at")
    protected LocalDateTime created_At;

    @Column(name = "updated_at")
    protected LocalDateTime updated_At;

    public BaseObject() {
        this.id = UUID.randomUUID().toString();
        this.created_At = LocalDateTime.now();
        this.updated_At = LocalDateTime.now();
    }

    public void save() {
        this.updated_At = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreated_At() {
        return created_At;
    }

    public void setCreated_At(LocalDateTime created_At) {
        this.created_At = created_At;
    }

    public LocalDateTime getUpdated_At() {
        return updated_At;
    }

    public void setUpdated_At(LocalDateTime updated_At) {
        this.updated_At = updated_At;
    }
}
