package com.agency04.sbss.pizza.controllers;

import com.agency04.sbss.pizza.models.rest.Customer;
import com.agency04.sbss.pizza.services.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final PizzaDeliveryService pizzaDeliveryService;

    @Autowired
    public CustomerController(PizzaDeliveryService pizzaDeliveryService) {
        this.pizzaDeliveryService = pizzaDeliveryService;
    }

    @GetMapping("/{username}")
    public Customer getCustomer(@PathVariable String username) {
        return pizzaDeliveryService.getCustomer(username);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> putCustomer(@RequestBody Customer customer) {
        return pizzaDeliveryService.putCustomer(customer);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> postCustomer(@RequestBody Customer customer) {
        return pizzaDeliveryService.postCustomer(customer);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String username) {
        return pizzaDeliveryService.deleteCustomer(username);
    }
}

