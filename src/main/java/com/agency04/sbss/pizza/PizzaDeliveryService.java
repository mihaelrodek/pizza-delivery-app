package com.agency04.sbss.pizza;

public class PizzaDeliveryService {

    private PizzeriaService pizzeriaService;

    public PizzaDeliveryService() {
        System.out.println("PizzaDeliveryService: inside no-arg constructor");
    }

    public PizzaDeliveryService(PizzeriaService pizzeriaService) {
        this.pizzeriaService = pizzeriaService;
        System.out.println("PizzaDeliveryService: inside arg constructor");
    }

    public void setPizzeriaService(PizzeriaService pizzeriaService) {
        System.out.println("PizzaDeliveryService: setPizzeriaService");
        this.pizzeriaService = pizzeriaService;
    }

    public String orderPizza(Pizza pizza) {
        return "Name: " + pizza.getName() + "Ingredients: " + pizza.getIngredients() +  "Description: "+pizza.getDescription();

    }

}
