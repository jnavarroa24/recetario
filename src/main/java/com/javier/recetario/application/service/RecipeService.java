package com.javier.recetario.application.service;


import com.javier.recetario.application.dto.CreateRecipeDto;
import org.springframework.stereotype.Service;

public interface RecipeService {

    void create(CreateRecipeDto recipe);

}
