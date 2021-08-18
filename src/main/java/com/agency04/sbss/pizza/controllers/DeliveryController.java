package com.agency04.sbss.pizza.controllers;


import com.agency04.sbss.pizza.models.Delivery;
import com.agency04.sbss.pizza.services.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    private final PizzaDeliveryService pizzaDeliveryService;

    @Autowired
    public DeliveryController(PizzaDeliveryService pizzaDeliveryService) {
        this.pizzaDeliveryService = pizzaDeliveryService;
    }

    @PostMapping("/delivery/order")
    public ResponseEntity<HttpStatus> postOrder(@RequestBody Delivery delivery) {
        return pizzaDeliveryService.postOrder(delivery);
    }

    @GetMapping("/delivery/list")
    public List<Delivery> getOrders() {
        return pizzaDeliveryService.getOrders();
    }
}

