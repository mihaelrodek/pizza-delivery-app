package com.agency04.sbss.pizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        System.out.println();

        PizzaDeliveryService firstDelivery = context.getBean("deliveryFirst", PizzaDeliveryService.class);
        firstDelivery.orderPizza(new MargheritaPizza());

        PizzaDeliveryService secondDelivery = context.getBean("deliverySecond", PizzaDeliveryService.class);
        secondDelivery.orderPizza(new QuattroFormaggiPizza());

        context.close();

    }

}
