package com.school.tutorialApp.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClassRequest {
    static final String NAME_REQUIRED_MESSAGE = "The name field is required";
    static final String DESCRIPTION_REQUIRED_MESSAGE = "The description field is required";

    @NotBlank(message = NAME_REQUIRED_MESSAGE )
    private String name;

    @NotBlank(message = DESCRIPTION_REQUIRED_MESSAGE)
    private String description;


}
