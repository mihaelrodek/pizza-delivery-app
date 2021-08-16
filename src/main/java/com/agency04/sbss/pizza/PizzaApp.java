package com.agency04.sbss.pizza;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);
        System.out.println();

        PizzaDeliveryService pizzaDeliveryService = context.getBean("pizzaDeliveryService", PizzaDeliveryService.class);
        System.out.println(pizzaDeliveryService.orderPizza(new QuattroFormaggiPizza()));

        //test for pizzeria service
        PizzeriaService pizzeriaService = context.getBean(PizzeriaService.class);
        System.out.println(pizzeriaService.makePizza(new MargheritaPizza()));

        context.close();
    }

}


