package nl.smallproject.www.futureseedbackend.mappers;

import nl.smallproject.www.futureseedbackend.dtos.user.UserInputOrUpdatedto;
import nl.smallproject.www.futureseedbackend.dtos.user.UserOutputDto;
import nl.smallproject.www.futureseedbackend.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toEntity(UserInputOrUpdatedto userInputDto) {
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

    public UserOutputDto toDto(User user) {
        UserOutputDto userOutputDto = new UserOutputDto();
        userOutputDto.setId(user.getId());
        userOutputDto.setUsername(user.getUsername());
        userOutputDto.setPassword(user.getPassword());
        userOutputDto.setEmail(user.getEmail());
        userOutputDto.setFirstName(user.getFirstName());
        userOutputDto.setMiddleName(user.getMiddleName());
        userOutputDto.setLastName(user.getLastName());
        userOutputDto.setRole(user.getRole().toString());
        userOutputDto.setIsActive(user.getIsActive());
        userOutputDto.setCreated_At(user.getCreated_At());
        userOutputDto.setUpdated_At(user.getUpdated_At());
        return userOutputDto;
    }
}
