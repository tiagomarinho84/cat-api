package com.hexagonal.architecture.cat.api.domain.exception.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BusinessExceptionDetails {

    private String title;
    private int status;
    private String details;
    private LocalDateTime timestamp;
}
