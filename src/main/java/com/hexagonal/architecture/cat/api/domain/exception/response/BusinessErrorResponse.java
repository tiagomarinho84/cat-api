package com.hexagonal.architecture.cat.api.domain.exception.response;

public class BusinessErrorResponse {

    private String message;
    private String errorMessageCode;

    public BusinessErrorResponse(String message) {
        this.message = message;
    }

    public BusinessErrorResponse(String message, String errorMessageCode) {
        this.message = message;
        this.errorMessageCode = errorMessageCode;
    }

    public String getMessage() {
        return message;
    }

    public String getErrorMessageCode() {
        return errorMessageCode;
    }
}
