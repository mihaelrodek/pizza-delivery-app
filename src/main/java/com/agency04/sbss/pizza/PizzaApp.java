package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        System.out.println();

        PizzaDeliveryService pizzaDeliveryService = context.getBean("pizzaDeliveryService", PizzaDeliveryService.class);
        pizzaDeliveryService.orderPizza(new QuattroFormaggiPizza());

        context.close();
    }

}


