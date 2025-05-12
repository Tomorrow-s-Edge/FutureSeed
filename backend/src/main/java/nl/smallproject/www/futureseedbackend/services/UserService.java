package nl.smallproject.www.futureseedbackend.services;

import jakarta.transaction.Transactional;
import nl.smallproject.www.futureseedbackend.dtos.user.UserInputOrUpdatedto;
import nl.smallproject.www.futureseedbackend.dtos.user.UserOutputDto;
import nl.smallproject.www.futureseedbackend.exceptions.RecordNotFoundException;
import nl.smallproject.www.futureseedbackend.mappers.UserMapper;
import nl.smallproject.www.futureseedbackend.models.User;
import nl.smallproject.www.futureseedbackend.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Transactional
    public User CreateUser(UserInputOrUpdatedto userInputDto) {
        User user = userMapper.userInputDtoToEntity(userInputDto);
        userRepository.save(user);
        return user;
    }

    public List<UserOutputDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserOutputDto> userOutputDtos = new ArrayList<>();
        for (User user : users) {
            userOutputDtos.add(userMapper.userEntityToOutputDto(user));
        }
        return userOutputDtos;
    }

    @Transactional
    public void updateUser(String id, UserInputOrUpdatedto userUpdateDto) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("User not found with this id: " + id));

        User updatedUser = userMapper.userInputDtoToEntity(userUpdateDto);
        BeanUtils.copyProperties(updatedUser, existingUser, "id");
        userRepository.save(existingUser);
    }
}
