package nl.smallproject.www.futureseedbackend.controllers;

import nl.smallproject.www.futureseedbackend.dtos.student.StudentInputOrUpdateDto;
import nl.smallproject.www.futureseedbackend.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> createStudent(@RequestBody StudentInputOrUpdateDto studentInputDto) {
        var newStudent = studentService.createStudent(studentInputDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + newStudent.getId())
                .buildAndExpand(newStudent)
                .toUri();

        return ResponseEntity.created(location).eTag(String.valueOf(HttpStatus.CREATED.value())).body(newStudent);
    }
}
