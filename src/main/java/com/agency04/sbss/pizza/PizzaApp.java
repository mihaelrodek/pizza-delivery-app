package com.agency04.sbss.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        SpringApplication.run(PizzaApp.class, args);

        PizzaDeliveryService pizzaDeliveryService = new PizzaDeliveryService();

        System.out.println(pizzaDeliveryService.orderPizza(new QuattroFormaggiPizza()));

    }

}


