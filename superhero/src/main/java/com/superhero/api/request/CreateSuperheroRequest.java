package com.superhero.api.request;

import jakarta.validation.constraints.NotBlank;

public record CreateSuperheroRequest(@NotBlank String firstName, @NotBlank String lastName, @NotBlank String superheroName) {
}
