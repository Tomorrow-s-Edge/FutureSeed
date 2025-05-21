package nl.smallproject.www.futureseedbackend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseObject {

    @Id
    @GeneratedValue
    protected UUID id;

    @Column(name = "created_at")
    protected LocalDateTime created_At;

    @Column(name = "updated_at")
    protected LocalDateTime updated_At;

    @PrePersist
    protected void onCreate() {
        this.created_At = LocalDateTime.now();
        this.updated_At = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updated_At = LocalDateTime.now();
    }
}
