package com.javier.recetario.domain.repository;

import com.javier.recetario.domain.model.Recipe;

import java.util.Optional;

public interface RecipeRepository {

    Recipe save(Recipe recipe);
    Optional<Recipe> findById(String id);
}
