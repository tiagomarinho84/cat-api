package com.hexagonal.architecture.cat.api.adapter.rest.controller;

import com.hexagonal.architecture.cat.api.adapter.service.CatClientServicePortImpl;
import com.hexagonal.architecture.cat.api.domain.document.AllBreeds;
import com.hexagonal.architecture.cat.api.domain.exception.BusinessException;
import com.hexagonal.architecture.cat.api.domain.exception.TechnicalException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
@RequestMapping("/catApi/insert")
@Tag(name = "CATS ", description = "Case Cat API")
public class CatPostController {

    final
    CatClientServicePortImpl service;

    @ApiOperation(value = "POST Method")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 201, message = "Created"),
                    @ApiResponse(code = 400, message = "Invalid data"),
                    @ApiResponse(code = 404, message = "Client not found")
            })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Flux<AllBreeds> saveBreeds(@RequestBody Flux<AllBreeds> breeds) throws BusinessException, TechnicalException {
        return service.create(breeds);
    }
}
