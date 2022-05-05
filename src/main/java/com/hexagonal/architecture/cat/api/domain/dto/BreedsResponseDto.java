package com.hexagonal.architecture.cat.api.domain.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BreedsResponseDto {

    private String origin;
    private String temperament;
    private String description;
}
