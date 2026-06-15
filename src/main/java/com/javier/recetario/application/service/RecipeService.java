package com.javier.recetario.application.service;


import com.javier.recetario.application.dto.CreateRecipeDto;

public interface RecipeService {

    void create(CreateRecipeDto recipe);

}
