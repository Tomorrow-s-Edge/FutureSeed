package nl.smallproject.www.futureseedbackend.controllers;

import nl.smallproject.www.futureseedbackend.dtos.SubjectOutputDto;
import nl.smallproject.www.futureseedbackend.services.SubjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/addresses")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<SubjectOutputDto>> getAllSubjects() {
        List<SubjectOutputDto> subjectOutputDtos = subjectService.getAllSubjects();
        return ResponseEntity.ok(subjectOutputDtos);
    }
}
