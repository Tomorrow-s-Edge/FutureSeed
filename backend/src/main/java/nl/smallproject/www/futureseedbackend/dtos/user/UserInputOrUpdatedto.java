package nl.smallproject.www.futureseedbackend.dtos.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInputOrUpdatedto {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String role;
    private Boolean isActive;
}
