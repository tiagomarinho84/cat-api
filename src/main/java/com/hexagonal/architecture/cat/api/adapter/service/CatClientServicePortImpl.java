package com.hexagonal.architecture.cat.api.adapter.service;

import com.hexagonal.architecture.cat.api.adapter.rest.response.AllBreedsResponse;
import com.hexagonal.architecture.cat.api.adapter.rest.response.BreedsForNameResponse;
import com.hexagonal.architecture.cat.api.domain.document.AllBreeds;
import com.hexagonal.architecture.cat.api.domain.exception.BusinessException;
import com.hexagonal.architecture.cat.api.domain.exception.TechnicalException;
import com.hexagonal.architecture.cat.api.infra.repository.BreedsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeFunction;
import org.springframework.web.reactive.function.client.ExchangeFunctions;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
@Slf4j
public class CatClientServicePortImpl implements CatClientServicePort {

    private final BreedsRepository repository;
    private final WebClient webClient;

    public CatClientServicePortImpl(WebClient.Builder builder, BreedsRepository repository) {

        ExchangeFunction exchangeFunction =
                ExchangeFunctions.create(new ReactorClientHttpConnector());

        webClient = builder
                .baseUrl("https://api.thecatapi.com/")
                .exchangeFunction(exchangeFunction)
                .build();
        this.repository = repository;
    }

    // a. API capaz de listar todas as raças
    @Override
    public Flux<AllBreedsResponse> findAllBreeds() throws BusinessException, TechnicalException {

        log.info("Listing all registered breeds");
        try {
            return webClient
                    .get()
                    .uri("/v1/breeds")
                    .retrieve()
                    .bodyToFlux(AllBreedsResponse.class);
        } catch (IllegalArgumentException e) {
            throw new BusinessException("Breeds not found, details: ", e);
        } catch (DataAccessException e) {
            throw new TechnicalException("Backend for findAllBreeds is unavailable, details:", e);
        }
    }

    // b. API capaz de listar as informações de uma raça
    @Override
    public Flux<BreedsForNameResponse> findBreedByName(String name) throws BusinessException, TechnicalException {

        log.info("Search cat by name {} ", name);
        try {
            return webClient
                    .get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/v1/breeds/search")
                            .queryParam("name", name)
                            .build())
                    .retrieve()
                    .bodyToFlux(BreedsForNameResponse.class);
        } catch (IllegalArgumentException e) {
            throw new BusinessException("Breeds name not found, details: ", e);
        } catch (DataAccessException e) {
            throw new TechnicalException("Backend for findBreedByName is unavailable, details:", e);
        }
    }

    // Armazenar as informações de origem, temperamento e descrição em uma base de dados
    @Override
    public Flux<AllBreeds> create(Flux<AllBreeds> breeds) throws BusinessException, TechnicalException {

        log.info("Create information breeds ");
        try {
            return repository.insert(breeds);
        } catch (IllegalArgumentException e) {
            throw new BusinessException("Breeds not save, details: ", e);
        } catch (DataAccessException e) {
            throw new TechnicalException("Backend for create is unavailable, details:", e);
        }
    }
}



















