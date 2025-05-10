package nl.smallproject.www.futureseedbackend.services;

import jakarta.transaction.Transactional;
import nl.smallproject.www.futureseedbackend.dtos.user.UserInputOrUpdatedto;
import nl.smallproject.www.futureseedbackend.mappers.UserMapper;
import nl.smallproject.www.futureseedbackend.models.User;
import nl.smallproject.www.futureseedbackend.repositories.UserRepository;
import org.springframework.stereotype.Service;

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
}
