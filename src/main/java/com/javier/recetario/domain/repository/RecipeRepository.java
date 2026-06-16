package com.javier.recetario.domain.repository;

import com.javier.recetario.domain.model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecipeRepository {

    Recipe save(Recipe recipe);
    Optional<Recipe> findById(String id);
}
