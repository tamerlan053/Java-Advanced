package com.superhero.service;

import com.superhero.repository.SuperheroRepository;
import org.springframework.stereotype.Service;

@Service
public class SuperheroService {
    private final SuperheroRepository superheroRepository;

    public SuperheroService(SuperheroRepository superheroRepository) {
        this.superheroRepository = superheroRepository;
    }
}
