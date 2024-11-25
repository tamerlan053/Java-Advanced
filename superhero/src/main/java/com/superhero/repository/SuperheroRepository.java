package com.superhero.repository;

import com.superhero.domain.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SuperheroRepository extends JpaRepository<Superhero, Long> {
    boolean existsSuperheroBySuperheroName(String superheroName);
    Optional<Superhero> findSuperheroBySuperheroName(String superheroName);
}
