package com.javier.recetario.application.dto;

import lombok.Data;

import java.util.List;

@Data
public class CreateRecipeDto {
    private String title;

    private Integer baseServings;

    private List<IngredientDto> ingredients;
}
