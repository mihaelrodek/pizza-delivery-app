package com.agency04.sbss.pizza.models.rest;

public class DeliveryOrderForm {

    private String username;

    private PizzaForm pizzaForm;

    public DeliveryOrderForm() {
    }

    public DeliveryOrderForm(String username, PizzaForm pizzaForm) {
        this.username = username;
        this.pizzaForm = pizzaForm;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PizzaForm getPizzaForm() {
        return pizzaForm;
    }

    public void setPizzaForm(PizzaForm pizzaForm) {
        this.pizzaForm = pizzaForm;
    }
}
