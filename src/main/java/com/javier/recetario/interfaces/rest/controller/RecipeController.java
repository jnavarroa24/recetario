package com.javier.recetario.interfaces.rest.controller;

import com.javier.recetario.application.service.RecipeService;
import com.javier.recetario.interfaces.rest.mapper.RecipeRestMapper;
import com.javier.recetario.interfaces.rest.request.CreateRecipeRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService service;
    private final RecipeRestMapper mapper;

    public RecipeController(
            RecipeService service,
            RecipeRestMapper mapper
    ) {

        this.service = service;
        this.mapper = mapper;

    }

    @PostMapping
    @ResponseStatus(
            HttpStatus.CREATED
    )
    public void create(@RequestBody CreateRecipeRequest request) {
        service.create(mapper.toDto(request)
        );

    }

}