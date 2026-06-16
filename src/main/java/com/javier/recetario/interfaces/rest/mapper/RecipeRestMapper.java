package com.javier.recetario.interfaces.rest.mapper;

import com.javier.recetario.application.dto.CreateRecipeDto;
import com.javier.recetario.application.dto.CreateRecipeResponseDto;
import com.javier.recetario.domain.model.Recipe;
import com.javier.recetario.interfaces.rest.request.CreateRecipeRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecipeRestMapper {

    CreateRecipeDto toDto(CreateRecipeRequest request);

}
