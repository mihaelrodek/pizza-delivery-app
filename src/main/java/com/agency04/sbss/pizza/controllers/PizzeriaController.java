package com.agency04.sbss.pizza.controllers;

import com.agency04.sbss.pizza.models.rest.MenuResponse;
import com.agency04.sbss.pizza.models.rest.PizzeriaResponse;
import com.agency04.sbss.pizza.services.PizzaDeliveryService;
import com.agency04.sbss.pizza.services.PizzeriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pizzeria")
public class PizzeriaController {

    private final PizzeriaService pizzeriaService;

    public PizzeriaController(PizzaDeliveryService pizzaDeliveryService) {
        this.pizzeriaService = pizzaDeliveryService.getPizzeriaService();
    }

    @GetMapping("/menu")
    @ResponseBody
    public MenuResponse getMenu() {
        MenuResponse menu = new MenuResponse();

        menu.setPizzas(pizzeriaService.getPizzas());
        menu.setSizes(pizzeriaService.getSizes());

        return menu;
    }

    @GetMapping("/")
    @ResponseBody
    public PizzeriaResponse getPizzeria() {
        PizzeriaResponse pizzeria = new PizzeriaResponse();

        pizzeria.setName(pizzeriaService.getName());
        pizzeria.setAddress(pizzeriaService.getAddress());

        return pizzeria;
    }
}

