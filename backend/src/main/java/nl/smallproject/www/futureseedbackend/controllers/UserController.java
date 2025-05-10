package nl.smallproject.www.futureseedbackend.controllers;

import nl.smallproject.www.futureseedbackend.dtos.user.UserInputOrUpdatedto;
import nl.smallproject.www.futureseedbackend.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method =  RequestMethod.POST)
    public ResponseEntity<Object> createUser(@RequestBody UserInputOrUpdatedto userInputDto) {
        var newUser = userService.CreateUser(userInputDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + newUser.getId())
                .buildAndExpand(newUser)
                .toUri();

        return ResponseEntity.created(location).eTag(String.valueOf(HttpStatus.CREATED)).body(newUser);
    }
}
