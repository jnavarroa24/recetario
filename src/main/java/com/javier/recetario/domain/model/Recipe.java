package com.javier.recetario.domain.model;

import java.util.List;

public class Recipe {

    private String id;

    private String title;

    private Integer baseServings;

    private List<Ingredient> ingredients;

    public Recipe(
            String id,
            String title,
            Integer baseServings,
            List<Ingredient> ingredients
    ) {

        validate(title, baseServings);

        this.id = id;
        this.title = title;
        this.baseServings = baseServings;
        this.ingredients = ingredients;
    }

    private void validate(
            String title,
            Integer servings
    ) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title required");
        }

        if (servings <= 0) {
            throw new IllegalArgumentException("Invalid servings");
        }
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getBaseServings() {
        return baseServings;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

}