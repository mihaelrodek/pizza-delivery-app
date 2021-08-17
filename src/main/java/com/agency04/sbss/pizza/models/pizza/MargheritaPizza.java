package com.agency04.sbss.pizza.models.pizza;

import com.agency04.sbss.pizza.models.pizza.Pizza;

import java.util.List;

public class MargheritaPizza implements Pizza {

    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public List<Ingredients> getIngredients() {
        return List.of(Ingredients.TOMATO_SAUCE, Ingredients.MOZZARELLA, Ingredients.OREGANO);
    }

    @Override
    public String getDescription() {
        return "Classical margherita pizza without salami";
    }

    @Override
    public Integer getPrice() {
        return 40;
    }
}
