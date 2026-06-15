package com.javier.recetario.application.mapper;

import com.javier.recetario.application.dto.CreateRecipeDto;
import com.javier.recetario.domain.model.Recipe;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    Recipe toDomain(CreateRecipeDto dto);

}
