package com.school.tutorialApp.controller;

import com.school.tutorialApp.dto.ClassRequest;
import com.school.tutorialApp.dto.ClassResponse;
import com.school.tutorialApp.exception.ApiResponse;
import com.school.tutorialApp.service.ClassService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/schoolclass/")
@RequiredArgsConstructor
public class ClassController {

    private final ClassService classService;

    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<ClassResponse> createClass(@Valid @RequestBody ClassRequest request){
        ApiResponse apiResponse = ApiResponse.builder()
                .message(" class created succesfully")
                .data(classService.createClass(request))
                .success(true)
                .build();
                classService.createClass(request);
         return apiResponse;
    }

    @GetMapping("{id}")
    public  ClassResponse getClassById(@Valid @PathVariable UUID id){
        return  classService.getClassById(id);
    }

}
