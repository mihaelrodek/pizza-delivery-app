package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.models.rest.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerRepository {

    private static Optional<Customer> findCustomer(List<Customer> customers, String username){

        return customers.stream()
                .filter(c -> c.getUsername().equals(username))
                .findAny();
    }
}
