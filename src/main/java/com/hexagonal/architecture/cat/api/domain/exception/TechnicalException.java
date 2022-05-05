package com.hexagonal.architecture.cat.api.domain.exception;

public class TechnicalException extends Exception {

    private String errorMessageCode;

    public TechnicalException(String message) {
        super(message);
    }

    public TechnicalException(String message, Throwable cause){
        super(message, cause);
    }

    public TechnicalException(String message, String errorMessageCode) {
        super(message);
        this.errorMessageCode = errorMessageCode;
    }

    public TechnicalException(String message, Throwable cause, String errorMessageCode) {
        super(message, cause);
        this.errorMessageCode = errorMessageCode;
    }

    public String getErrorMessageCode() {
        return errorMessageCode;
    }
}
