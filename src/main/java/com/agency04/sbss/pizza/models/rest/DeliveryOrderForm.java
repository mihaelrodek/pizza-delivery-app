package com.agency04.sbss.pizza.models.rest;

import com.agency04.sbss.pizza.models.pizza.Pizza;
import com.agency04.sbss.pizza.models.pizza.Size;

public class DeliveryOrderForm {

    private String username;

    private Pizza pizza;

    private Size size;

    private int quantity;

    public DeliveryOrderForm() {
    }

    public DeliveryOrderForm(String username, Pizza pizza, Size size, int quantity) {
        this.username = username;
        this.pizza = pizza;
        this.size = size;
        this.quantity = quantity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
