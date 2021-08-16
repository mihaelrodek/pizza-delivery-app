package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaDeliveryService {

    private PizzeriaService pizzeriaService;

    public PizzaDeliveryService() {
        System.out.println("PizzaDeliveryService: inside no-arg constructor");
    }

    @Autowired
    public PizzaDeliveryService(PizzeriaService pizzeriaService) {
        this.pizzeriaService = pizzeriaService;
        System.out.println("PizzaDeliveryService: inside arg constructor");
    }

    @Autowired
    public void setPizzeriaService(@Qualifier("rajPizzeria") PizzeriaService pizzeriaService) {
        System.out.println("PizzaDeliveryService: setPizzeriaService");
        this.pizzeriaService = pizzeriaService;
    }

    public String orderPizza(Pizza pizza) {
        return "Name: " + pizza.getName() + "Ingredients: " + pizza.getIngredients() +  "Description: "+pizza.getDescription()+"\n";
    }

}
