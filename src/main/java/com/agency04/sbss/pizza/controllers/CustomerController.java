package com.agency04.sbss.pizza.controllers;


import com.agency04.sbss.pizza.exceptions.PizzaException;
import com.agency04.sbss.pizza.models.Sex;
import com.agency04.sbss.pizza.models.rest.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private List<Customer> customers;

    @PostConstruct
    public void loadData() {
        customers = new ArrayList<>();

        customers.add(new Customer("mrodek", "Mihael", "Rodek", Sex.MALE, 21));
        customers.add(new Customer("pvrabec", "Petra", "Vrabec", Sex.FEMALE, 22));
        customers.add(new Customer("dbek", "Dominik", "Bek", Sex.UNDEFINED, 20));
    }

    public CustomerController() {
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    @GetMapping("/{username}")
    public Customer getCustomer(@PathVariable String username) {
        Optional<Customer> customer = customers.stream()
                .filter(c -> c.getUsername().equals(username))
                .findAny();

        if (customer.isEmpty())
            throw new PizzaException("No customer with given username found.");

        return customer.get();

    }

    @PostMapping("")
    public ResponseEntity<HttpStatus> postCustomer(@RequestBody Customer customerBody) {
        Optional<Customer> customer = customers.stream()
                .filter(c -> c.getUsername().equals(customerBody.getUsername()))
                .findAny();

        if (customer.isPresent())
            throw new PizzaException("Customer with given username is already registered.");


        customers.add(customerBody);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<HttpStatus> putCustomer(@RequestBody Customer customerBody) {
        Optional<Customer> customer = customers.stream()
                .filter(c -> c.getUsername().equals(customerBody.getUsername()))
                .findAny();

        if (customer.isEmpty())
            throw new PizzaException("No customer with given username found.");

        customer.get().setName(customerBody.getName());
        customer.get().setSurname(customerBody.getSurname());
        customer.get().setAge(customerBody.getAge());
        customer.get().setSex(customerBody.getSex());

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String username) {
        Optional<Customer> customer = customers.stream()
                .filter(c -> c.getUsername().equals(username))
                .findAny();

        customer.ifPresentOrElse(
                (value -> customers.remove(value)),
                () -> { throw new PizzaException("No customer with given username found."); }
        );

        return ResponseEntity.ok(HttpStatus.OK);
    }
}

