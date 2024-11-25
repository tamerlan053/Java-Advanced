package com.superhero.service;

import com.superhero.api.request.CreateSuperheroRequest;
import com.superhero.domain.Superhero;
import com.superhero.repository.SuperheroRepository;
import org.springframework.stereotype.Service;

@Service
public class SuperheroService {
    private final SuperheroRepository superheroRepository;

    public SuperheroService(SuperheroRepository superheroRepository) {
        this.superheroRepository = superheroRepository;
    }

    public void createSuperhero(CreateSuperheroRequest superheroRequest) {
        if (superheroRepository.existsSuperheroBySuperheroName(superheroRequest.superheroName())) {
            throw new RuntimeException("Duplicate superhero name " + superheroRequest.superheroName());
        }
        Superhero superhero = new Superhero(superheroRequest.firstName(), superheroRequest.lastName(), superheroRequest.superheroName());

        superheroRepository.save(superhero);
    }
}
