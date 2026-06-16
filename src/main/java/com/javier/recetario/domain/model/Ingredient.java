package com.javier.recetario.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Ingredient {

    private String name;
    private BigDecimal quantity;
    private String unit;

}