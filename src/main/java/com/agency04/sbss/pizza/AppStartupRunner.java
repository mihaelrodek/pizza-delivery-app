package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.models.rest.Customer;
import com.agency04.sbss.pizza.models.CustomerDetails;
import com.agency04.sbss.pizza.services.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AppStartupRunner implements ApplicationRunner {

    private final PizzaDeliveryService pizzaDeliveryService;

    @Autowired
    public AppStartupRunner(PizzaDeliveryService pizzaDeliveryService) {
        this.pizzaDeliveryService = pizzaDeliveryService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        pizzaDeliveryService.setPizzas();

        List<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer(
                "mrodek",
                null,
                new ArrayList<>()
        );

        customer1.setCustomerDetails(new CustomerDetails(
                "Mihael",
                "Rodek",
                "123456789"
        ));

        Customer customer2 = new Customer(
                "dbek",
                null,
                new ArrayList<>()
        );

        customer2.setCustomerDetails(new CustomerDetails(
                "Dominik",
                "Bek",
                "987654321"
        ));

        customers.add(customer1);
        customers.add(customer2);

        pizzaDeliveryService.saveCustomers(customers);
    }
}
