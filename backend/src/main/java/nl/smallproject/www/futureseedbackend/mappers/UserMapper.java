package nl.smallproject.www.futureseedbackend.mappers;

import nl.smallproject.www.futureseedbackend.dtos.user.UserInputOrUpdatedto;
import nl.smallproject.www.futureseedbackend.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User userInputDtoToEntity(UserInputOrUpdatedto userInputDto) {
        User user = new User();
        user.setUsername(userInputDto.getUsername());
        user.setPassword(userInputDto.getPassword());
        user.setEmail(userInputDto.getEmail());
        user.setFirstName(userInputDto.getFirstName());
        user.setMiddleName(userInputDto.getMiddleName());
        user.setLastName(userInputDto.getLastName());
        user.setRole(userInputDto.getRole().toString());
        user.setIsActive(userInputDto.getIsActive());
        return user;
    }
}
