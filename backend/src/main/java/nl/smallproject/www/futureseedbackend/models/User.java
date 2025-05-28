package nl.smallproject.www.futureseedbackend.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "users")
public class User extends BaseObject{
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String role;
    private Boolean isActive;

    public User() {
        super();
    }
}
