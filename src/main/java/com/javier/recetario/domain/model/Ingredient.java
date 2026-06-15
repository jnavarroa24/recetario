package com.javier.recetario.domain.model;

import java.math.BigDecimal;

public class Ingredient {

    private String name;

    private BigDecimal quantity;

    private Unit unit;

    public Ingredient(
            String name,
            BigDecimal quantity,
            Unit unit
    ) {

        validate(name, quantity);

        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    private void validate(
            String name,
            BigDecimal quantity
    ) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }

        if (quantity.signum() <= 0) {
            throw new IllegalArgumentException();
        }

    }

    public String getName() {
        return name;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public Unit getUnit() {
        return unit;
    }

}