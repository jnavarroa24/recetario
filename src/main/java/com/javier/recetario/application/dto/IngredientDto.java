package com.javier.recetario.application.dto;

import com.javier.recetario.domain.model.Unit;
import lombok.Data;
import java.math.BigDecimal;


@Data
public class IngredientDto {
    private String name;
    private BigDecimal quantity;
    private String unit;
}
