package nl.smallproject.www.futureseedbackend.controllers;

import nl.smallproject.www.futureseedbackend.dtos.subject.SubjectInputOrUpdateDto;
import nl.smallproject.www.futureseedbackend.dtos.subject.SubjectOutputDto;
import nl.smallproject.www.futureseedbackend.services.SubjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/subjects")
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

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> createSubject(@RequestBody SubjectInputOrUpdateDto subjectInputDto) {
        var newSubject = subjectService.createSubject(subjectInputDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + newSubject.getId())
                .buildAndExpand(newSubject)
                .toUri();

        return ResponseEntity.created(location).eTag(String.valueOf(HttpStatus.CREATED)).body(newSubject);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateSubject(@PathVariable String id, @RequestBody SubjectInputOrUpdateDto subjectUpdateDto) {
        subjectService.updateSubject(id, subjectUpdateDto);
        return ResponseEntity.noContent().build();
    }
}
