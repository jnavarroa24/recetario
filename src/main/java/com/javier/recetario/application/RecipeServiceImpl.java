package com.javier.recetario.application;

import com.javier.recetario.application.service.RecipeService;
import com.javier.recetario.domain.model.Recipe;
import com.javier.recetario.domain.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@AllArgsConstructor
@Slf4j
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository repository;

    public RecipeServiceImpl(RecipeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Recipe create(Recipe recipe) {

        return repository.save(recipe);

    }
}
