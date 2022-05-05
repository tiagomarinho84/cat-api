package com.hexagonal.architecture.cat.api.infra.repository;


import com.hexagonal.architecture.cat.api.adapter.rest.response.AllBreedsResponse;
import com.hexagonal.architecture.cat.api.domain.document.AllBreeds;
import com.hexagonal.architecture.cat.api.domain.document.Breeds;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BreedsRepository extends ReactiveMongoRepository<Breeds, String> {

    Mono<AllBreedsResponse> getAllBreedsByTemperament(String temperament);

    Flux<AllBreeds> insert(Flux<AllBreeds> breeds);

    Mono<Object> insert(AllBreeds breeds);
}
