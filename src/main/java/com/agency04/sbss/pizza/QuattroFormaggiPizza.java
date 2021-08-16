package com.agency04.sbss.pizza;

public class QuattroFormaggiPizza implements Pizza{

    @Override
    public String getName() {
        return "Quattro Formaggi";
    }

    @Override
    public String getIngredients() {
        return "Tomato sauce, mozzarella, parmesan, gorgonzola cheese, artichokes, and oregano";
    }

    @Override
    public String getDescription() {
        return "Pizza for cheese lovers";
    }
}
