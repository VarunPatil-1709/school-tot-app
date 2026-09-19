package com.school.tutorialApp.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "student") 
@Entity 
@Setter 
@Getter 
@AllArgsConstructor 
@NoArgsConstructor 
public class Student {

    @Id 
    @GeneratedValue 
    private UUID id;
    
    private String firstName;

    private String lastName;

    private int dateOfBirth;

    private String SchoolGender;

    private String email;

    private int phoneNumber;

    private String address;

    private int classid;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;









}
