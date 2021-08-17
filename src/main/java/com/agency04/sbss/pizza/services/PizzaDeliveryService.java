package com.agency04.sbss.pizza.services;

import com.agency04.sbss.pizza.models.pizza.Pizza;
import com.agency04.sbss.pizza.models.rest.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class PizzaDeliveryService {

    private PizzeriaService pizzeriaService;

    private List<Order> orders;

    public PizzaDeliveryService() {
    }

    @PostConstruct
    public void loadData() {
        orders = new ArrayList<>();
    }

    @Autowired
    public PizzaDeliveryService(PizzeriaService pizzeriaService) {
        this.pizzeriaService = pizzeriaService;
    }

    public void setPizzeriaService(@Qualifier("rajPizzeria") PizzeriaService pizzeriaService) {
        this.pizzeriaService = pizzeriaService;
    }

    public PizzeriaService getPizzeriaService() {
        return pizzeriaService;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String orderPizza(Pizza pizza) {
        return "Name: " + pizza.getName() + "\n" + "Ingredients: " + pizza.getIngredients() + "\n" +
                "Description: " + pizza.getDescription() + "\n";
    }

}

