package com.school.tutorialApp.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ApiResponse<T> {

    private boolean success;
    private String message;
    private int status;
    private T data;

    public ApiResponse() {
    }

    public ApiResponse(boolean success, String message, int status, T data) {
        this.success = success;
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

}