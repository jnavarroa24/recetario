package com.javier.recetario.infraestructure.persistence;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "recipes")
public class RecipeDocument {

    @Id
    private String id;
    private String title;
    private Integer baseServings;
    private List<IngredientDocument> ingredients;

    public RecipeDocument() {
    }

    public RecipeDocument(
            String id,
            String title,
            Integer baseServings,
            List<IngredientDocument> ingredients
    ) {

        this.id = id;
        this.title = title;
        this.baseServings = baseServings;
        this.ingredients = ingredients;

    }


}
