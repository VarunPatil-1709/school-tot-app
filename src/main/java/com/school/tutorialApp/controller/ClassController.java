package com.school.tutorialApp.controller;

import com.school.tutorialApp.dto.ClassRequest;
import com.school.tutorialApp.dto.ClassResponse;
import com.school.tutorialApp.service.ClassService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/schoolclass/")
@RequiredArgsConstructor
public class ClassController {

    private final ClassService classService;

    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ClassResponse createClass(@Valid @RequestBody ClassRequest request){
        return classService.createClass(request);
    }

}
