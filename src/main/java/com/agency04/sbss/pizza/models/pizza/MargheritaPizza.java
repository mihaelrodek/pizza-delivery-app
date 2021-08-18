package com.agency04.sbss.pizza.models.pizza;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class MargheritaPizza extends Pizza {

    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public List<Ingredients> getIngredients() {
        return List.of(Ingredients.TOMATO_SAUCE, Ingredients.MOZZARELLA, Ingredients.OREGANO);
    }

   // @Override
    // public String getDescription() {
    //     return "Classical margherita pizza without salami";
    // }

    //  @Override
    // public Integer getPrice() {
    //     return 40;
    // }
}
