package com.agency04.sbss.pizza.controllers;


import com.agency04.sbss.pizza.exceptions.PizzaException;
import com.agency04.sbss.pizza.models.CustomerDetails;
import com.agency04.sbss.pizza.models.Sex;
import com.agency04.sbss.pizza.models.rest.Customer;
import com.agency04.sbss.pizza.services.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private final PizzaDeliveryService pizzaDeliveryService;

    @Autowired
    public CustomerController(PizzaDeliveryService pizzaDeliveryService) {
        this.pizzaDeliveryService = pizzaDeliveryService;
    }

    @GetMapping("/customer/{username}")
    public Customer getCustomer(@PathVariable String username) {
        return pizzaDeliveryService.getCustomer(username);
    }

    @PutMapping("/customer")
    public ResponseEntity<HttpStatus> putCustomer(@RequestBody Customer customer) {
        return pizzaDeliveryService.putCustomer(customer);
    }

    @PostMapping("/customer")
    public ResponseEntity<HttpStatus> postCustomer(@RequestBody Customer customer) {
        return pizzaDeliveryService.postCustomer(customer);
    }

    @DeleteMapping("/customer/{username}")
    public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String username) {
        return pizzaDeliveryService.deleteCustomer(username);
    }
}

