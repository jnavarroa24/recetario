package com.javier.recetario.interfaces.rest.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class IngredientRequest {

    private String name;

    private BigDecimal quantity;

    private String unit;
}