package com.hexagonal.architecture.cat.api.domain.exception.handler;

import com.hexagonal.architecture.cat.api.domain.exception.TechnicalException;
import com.hexagonal.architecture.cat.api.domain.exception.ValidationException;
import com.hexagonal.architecture.cat.api.domain.exception.response.BusinessErrorResponse;
import com.hexagonal.architecture.cat.api.domain.exception.response.ValidationErrorResponse;
import com.hexagonal.architecture.cat.api.infra.config.MessageResourceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    private final MessageResourceUtil messageResource;

    public GlobalExceptionHandler(MessageResourceUtil messageResource) {
        this.messageResource = messageResource;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErrorResponse> processValidationError(MethodArgumentNotValidException ex) {

        logger.error(ex.getMessage(), ex);
        BindingResult result = ex.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();
        return ResponseEntity.status(HttpStatus.CONFLICT).body(processFieldErrors(fieldErrors));
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ValidationErrorResponse> processValidationError(ValidationException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getErrors());
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public void processNotFoundException(ChangeSetPersister.NotFoundException ex) {
        logger.error(ex.getMessage(), ex);
    }

    @ExceptionHandler(TechnicalException.class)
    public ResponseEntity<BusinessErrorResponse> processBusinessException(TechnicalException ex) {

        logger.error(ex.getMessage(), ex);
        String errorCode = ex.getErrorMessageCode() == null || ex.getErrorMessageCode().isEmpty() ?
                "TEC" : ex.getErrorMessageCode();

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new BusinessErrorResponse(ex.getMessage(), errorCode));
    }

    private ValidationErrorResponse processFieldErrors(final List<FieldError> errors) {
        ValidationErrorResponse response = new ValidationErrorResponse();

        for (final FieldError fieldError : errors) {
            response.addFieldError(fieldError.getField(), this.messageResource.get(fieldError.getDefaultMessage()));
        }
        return response;
    }
}
