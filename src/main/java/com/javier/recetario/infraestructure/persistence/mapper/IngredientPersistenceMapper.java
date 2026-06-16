package com.javier.recetario.infraestructure.persistence.mapper;

import com.javier.recetario.domain.model.Ingredient;
import com.javier.recetario.infraestructure.persistence.document.IngredientDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IngredientPersistenceMapper {

    Ingredient toDomain(IngredientDocument document);

    IngredientDocument toDocument(Ingredient ingredient);
}
