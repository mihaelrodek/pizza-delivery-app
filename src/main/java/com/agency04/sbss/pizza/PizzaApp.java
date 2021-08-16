package com.agency04.sbss.pizza;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);
        System.out.println();

        PizzaDeliveryService pizzaDeliveryService = context.getBean("pizzaDeliveryService", PizzaDeliveryService.class);
        System.out.println(pizzaDeliveryService.orderPizza(new QuattroFormaggiPizza()));

        context.close();
    }

}


