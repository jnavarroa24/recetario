package com.javier.recetario.infraestructure.persistence.repository;

import com.javier.recetario.infraestructure.persistence.document.RecipeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpringRecipeRepository extends MongoRepository<RecipeDocument, String> {

}
