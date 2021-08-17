package com.agency04.sbss.pizza;

public class MargheritaPizza implements Pizza{

    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public String getIngredients() {
        return "tomato sauce, mozzarella, and oregano";
    }

    @Override
    public String getDescription() {
        return "Classical margherita pizza without salami";
    }
}
