package com.hexagonal.architecture.cat.api.adapter.rest.controller;

import com.hexagonal.architecture.cat.api.adapter.rest.response.AllBreedsResponse;
import com.hexagonal.architecture.cat.api.adapter.rest.response.BreedsForNameResponse;
import com.hexagonal.architecture.cat.api.adapter.service.CatClientServicePortImpl;
import com.hexagonal.architecture.cat.api.domain.exception.BusinessException;
import com.hexagonal.architecture.cat.api.domain.exception.TechnicalException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("webclient")
@Slf4j
@Tag(name = "CATS ", description = "Case Cat API")
public class CatGetController {

    final
    CatClientServicePortImpl service;

    public CatGetController(CatClientServicePortImpl service) {
        this.service = service;
    }

    @ApiOperation(value = "GET Method")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Ok"),
                    @ApiResponse(code = 400, message = "Invalid data"),
                    @ApiResponse(code = 404, message = "Not found")
            })
    @GetMapping("v1/breeds")
    @ResponseStatus(HttpStatus.OK)
    public Flux<AllBreedsResponse> findAllBreeds() throws BusinessException, TechnicalException {
        log.info("Get All Breeds");
        return service.findAllBreeds();
    }

    @ApiOperation(value = "GET Method")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Ok"),
                    @ApiResponse(code = 400, message = "Invalid data"),
                    @ApiResponse(code = 404, message = "Not found")
            })
    @GetMapping("v1/breeds/search")
    @ResponseStatus(HttpStatus.OK)
    public Flux<BreedsForNameResponse> getBreedByName(@RequestParam(required = false, value = "name") String name) throws BusinessException, TechnicalException {
        log.info("Get Breed for name ");
        return service.findBreedByName(name);
    }

}
