package com.agency04.sbss.pizza.controllers;


import com.agency04.sbss.pizza.exceptions.PizzaException;
import com.agency04.sbss.pizza.models.pizza.Pizza;
import com.agency04.sbss.pizza.models.rest.Customer;
import com.agency04.sbss.pizza.models.rest.DeliveryOrderForm;
import com.agency04.sbss.pizza.models.rest.Order;
import com.agency04.sbss.pizza.services.PizzaDeliveryService;
import com.agency04.sbss.pizza.services.PizzeriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    List<Customer> customers;

    private final PizzaDeliveryService pizzaDeliveryService;

    private final PizzeriaService pizzeriaService;

    public DeliveryController(PizzaDeliveryService pizzaDeliveryService,
                              CustomerController customerController) {
        this.pizzaDeliveryService = pizzaDeliveryService;
        this.pizzeriaService = pizzaDeliveryService.getPizzeriaService();
        this.customers = customerController.getCustomers();
    }

    @PostMapping("/order")
    public ResponseEntity<HttpStatus> postOrder(@RequestBody DeliveryOrderForm orderForm) {
        Order order = new Order();

        Optional<Customer> customer = customers.stream()
                .filter(c -> c.getUsername().equals(orderForm.getUsername()))
                .findAny();

        customer.ifPresentOrElse(
                (order::setCustomer),
                () -> { throw new PizzaException("Customer not registered"); }
        );

        Optional<Pizza> pizza = pizzeriaService.getPizzas().stream()
                .filter(p -> p.getName().equals(orderForm.getPizzaForm().getPizza()))
                .findAny();

        pizza.ifPresentOrElse(
                (order::setPizza),
                () -> { throw new PizzaException("Pizza not available"); }
        );

        if (pizzeriaService.getSizes().contains(orderForm.getPizzaForm().getSize())) {
            order.setSize(orderForm.getPizzaForm().getSize());
        } else {
            throw new PizzaException("Size not available");
        }

        if (orderForm.getPizzaForm().getQuantity() > 0 && orderForm.getPizzaForm().getQuantity() <= 10) {
            order.setQuantity(orderForm.getPizzaForm().getQuantity());
        } else {
            throw new PizzaException("Please insert valid quantity (1-10)");
        }

        pizzaDeliveryService.getOrders().add(order);

        System.out.println(pizzaDeliveryService.orderPizza(order.getPizza()));

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/list")
    public List<Order> getOrders() {
        return pizzaDeliveryService.getOrders();
    }
}

