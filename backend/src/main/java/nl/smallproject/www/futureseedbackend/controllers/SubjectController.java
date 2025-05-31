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
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public ResponseEntity<List<SubjectOutputDto>> getAllSubjects() {
        List<SubjectOutputDto> subjectOutputDtos = subjectService.getAllSubjects();
        return ResponseEntity.ok(subjectOutputDtos);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<SubjectOutputDto> getSubjectById(@PathVariable UUID id) {
        SubjectOutputDto subjectOutputDto = subjectService.getSubjectById(id);
        return ResponseEntity.ok(subjectOutputDto);
    }

    @PostMapping
    public ResponseEntity<Object> createSubject(@RequestBody SubjectInputOrUpdateDto subjectInputDto) {
        var newSubject = subjectService.createSubject(subjectInputDto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + newSubject.getId())
                .buildAndExpand(newSubject)
                .toUri();

        return ResponseEntity.created(location).eTag(String.valueOf(HttpStatus.CREATED)).body(newSubject);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<Object> updateSubject(@PathVariable UUID id, @RequestBody SubjectInputOrUpdateDto subjectUpdateDto) {
        subjectService.updateSubject(id, subjectUpdateDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Object> deleteSubject(@PathVariable UUID id) {
        subjectService.deleteSubject(id);
        return ResponseEntity.noContent().build();
    }
}
