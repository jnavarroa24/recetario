package com.javier.recetario.interfaces.rest.request;

import lombok.Data;

import java.util.List;

@Data
public class CreateRecipeRequest {
    private String title;

    private Integer baseServings;

    private List<IngredientRequest> ingredients;
}
