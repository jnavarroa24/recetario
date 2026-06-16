package com.javier.recetario.application.service;


import com.javier.recetario.application.dto.CreateRecipeDto;
import com.javier.recetario.application.dto.CreateRecipeResponseDto;

public interface RecipeService {

    CreateRecipeResponseDto create(CreateRecipeDto recipe);

}
