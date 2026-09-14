package com.school.tutorialApp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private boolean success;
    private String message;
    private int status;
    private LocalDateTime timestamp;
    private Map<String, String> errors;


    public boolean isSuccess() {
        return success;
    }
    public ErrorResponse(
            boolean success,
            String message,
            int status,
            LocalDateTime timestamp
    ) {
        this.success = success;
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
    }
}