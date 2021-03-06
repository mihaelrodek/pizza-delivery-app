package com.agency04.sbss.pizza.models.pizza;

import java.util.List;

public class QuattroFormaggiPizza extends Pizza {

    @Override
    public String getName() {
        return "Quattro Formaggi";
    }

    @Override
    public List<Ingredients> getIngredients() {
        return List.of(Ingredients.TOMATO_SAUCE, Ingredients.MOZZARELLA, Ingredients.PARMESAN, Ingredients.GORGONZOLA, Ingredients.ARTICHOKES, Ingredients.OREGANO);
    }

    //@Override
    //public String getDescription() {
    //    return "Pizza for cheese lovers";
    //}

    //@Override
    //public Integer getPrice() {
    //   return 45;
    // }
}
