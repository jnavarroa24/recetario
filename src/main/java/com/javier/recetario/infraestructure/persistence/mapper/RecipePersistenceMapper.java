package com.javier.recetario.infraestructure.persistence.mapper;

import com.javier.recetario.domain.model.Recipe;
import com.javier.recetario.infraestructure.persistence.document.RecipeDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {IngredientPersistenceMapper.class})
public interface RecipePersistenceMapper {

    Recipe toDomain(RecipeDocument document);

    RecipeDocument toDocument(Recipe recipe);
}