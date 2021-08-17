package com.agency04.sbss.pizza.services;

import com.agency04.sbss.pizza.models.pizza.Pizza;
import com.agency04.sbss.pizza.models.pizza.Size;

import java.util.List;

public interface PizzeriaService {

    String getName();

    String getAddress();

    String makePizza(Pizza pizza);

    List<Pizza> getPizzas();

    List<Size> getSizes();


}
