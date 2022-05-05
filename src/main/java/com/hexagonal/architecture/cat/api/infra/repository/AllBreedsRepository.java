package com.hexagonal.architecture.cat.api.infra.repository;


import com.hexagonal.architecture.cat.api.adapter.rest.response.AllBreedsResponse;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AllBreedsRepository extends ReactiveMongoRepository<AllBreedsResponse, String> {
}
