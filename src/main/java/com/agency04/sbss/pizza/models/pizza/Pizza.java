package com.agency04.sbss.pizza.models.pizza;

import java.util.List;

public interface Pizza {

    String getName();
    List<Ingredients> getIngredients();
    String getDescription();
    Integer getPrice();

}
