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
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserOutputDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserOutputDto> userOutputDtos = new ArrayList<>();
        for (User user : users) {
            userOutputDtos.add(userMapper.toDto(user));
        }
        return userOutputDtos;
    }

    @Transactional
    public UserOutputDto getUserById(UUID id) {
        Optional<User> userOptional = Optional.ofNullable(userRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("User not found with this id: " + id)));

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return userMapper.toDto(user);
        } else {
            throw new RecordNotFoundException("User not found with this id: " + id);
        }
    }

    @Transactional
    public UserOutputDto CreateUser(UserInputOrUpdatedto userInputDto) {
        User user = userMapper.toEntity(userInputDto);
        userRepository.save(user);
        return userMapper.toDto(user);
    }

    @Transactional
    public void updateUser(UUID id, UserInputOrUpdatedto userUpdateDto) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("User not found with this id: " + id));

        User updatedUser = userMapper.toEntity(userUpdateDto);
        BeanUtils.copyProperties(updatedUser, existingUser, "id");
        userRepository.save(existingUser);
    }

    @Transactional
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}
