package com.school.tutorialApp.service;

import com.school.tutorialApp.dto.ClassRequest;
import com.school.tutorialApp.dto.ClassResponse;
import com.school.tutorialApp.entity.SchoolClass;
import com.school.tutorialApp.repository.ClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClassService {

    private final ClassRepository classRepository;


    public ClassResponse createClass(ClassRequest request) {
        if (request == null) {
            System.out.println("Your request is null");
        }
        SchoolClass clazz = new SchoolClass();
//        clazz.setId(UUID.randomUUID());
        clazz.setName(request.getName());
        clazz.setDescription(request.getDescription());
        clazz.setCreatedAt(LocalDateTime.now());
        clazz.setUpdatedAt(LocalDateTime.now());

        SchoolClass schoolClass =  classRepository.save(clazz);

        return convertSchoolClassTOClassResponse(schoolClass);

    }

    private ClassResponse convertSchoolClassTOClassResponse(SchoolClass schoolClass){
        ClassResponse classResponse = new ClassResponse();
        classResponse.setId(schoolClass.getId());
        classResponse.setName(schoolClass.getName());
        classResponse.setDescription(schoolClass.getDescription());
        classResponse.setCreatedAt(schoolClass.getCreatedAt());
        classResponse.setUpdatedAt(schoolClass.getUpdatedAt());
        return  classResponse;
    }
}
