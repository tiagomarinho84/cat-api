package com.hexagonal.architecture.cat.api.adapter.service;

import com.hexagonal.architecture.cat.api.adapter.rest.response.AllBreedsResponse;
import com.hexagonal.architecture.cat.api.adapter.rest.response.BreedsForNameResponse;
import com.hexagonal.architecture.cat.api.domain.document.AllBreeds;
import com.hexagonal.architecture.cat.api.domain.exception.BusinessException;
import com.hexagonal.architecture.cat.api.domain.exception.TechnicalException;
import reactor.core.publisher.Flux;

public interface CatClientServicePort {

    Flux<AllBreedsResponse> findAllBreeds() throws BusinessException, TechnicalException;

    Flux<BreedsForNameResponse> findBreedByName(String name) throws BusinessException, TechnicalException;

    Flux<AllBreeds> create(Flux<AllBreeds> breeds) throws BusinessException, TechnicalException;
}
