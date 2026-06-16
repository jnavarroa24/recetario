package com.javier.recetario.application;

import com.javier.recetario.application.dto.CreateRecipeDto;
import com.javier.recetario.application.mapper.RecipeMapper;
import com.javier.recetario.application.service.RecipeService;
import com.javier.recetario.domain.model.Recipe;
import com.javier.recetario.domain.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository repository;
    private final RecipeMapper mapper;

    public RecipeServiceImpl(RecipeRepository repository, RecipeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public void create(CreateRecipeDto recipe) {
        repository.save(mapper.toDomain(recipe));
    }
}
