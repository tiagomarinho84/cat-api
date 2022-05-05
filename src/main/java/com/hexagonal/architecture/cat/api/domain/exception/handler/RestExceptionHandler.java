package com.hexagonal.architecture.cat.api.domain.exception.handler;

import com.hexagonal.architecture.cat.api.domain.exception.BadRequestException;
import com.hexagonal.architecture.cat.api.domain.exception.BusinessException;
import com.hexagonal.architecture.cat.api.domain.exception.response.BadRequestExceptionDetails;
import com.hexagonal.architecture.cat.api.domain.exception.response.BusinessExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequestExceptionDetails> handlerBadRequestException(BadRequestException bre) {
        return new ResponseEntity<>(
                BadRequestExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.BAD_REQUEST.value())
                        .title("Bad Request Exception")
                        .details(bre.getMessage())
                        .build(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<BusinessExceptionDetails> handlerBusinessException(BusinessException be) {
        return new ResponseEntity<>(
                BusinessExceptionDetails.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.CONFLICT.value())
                        .title("Business Exception")
                        .details(be.getMessage())
                        .build(), HttpStatus.CONFLICT);
    }
}
