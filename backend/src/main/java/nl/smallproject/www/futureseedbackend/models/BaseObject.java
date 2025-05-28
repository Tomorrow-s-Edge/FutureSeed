package nl.smallproject.www.futureseedbackend.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class BaseObject {

    @Id
    @GeneratedValue
    protected UUID id;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    protected LocalDateTime created_At;

    @LastModifiedDate
    @Column(name = "updated_at")
    protected LocalDateTime updated_At;
}
