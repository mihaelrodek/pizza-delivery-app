package com.agency04.sbss.pizza;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "domenicoPizzeria")
public class DomenicoPizzeria implements PizzeriaService {

    private String name;
    private String address;

    @PostConstruct
    public void doMyStartup() {
        System.out.println("DomenicoPizzeria: inside of doMyStartup()");
        name = "Domenico";
        address = "Trg Slobode 7, Varaždin";
    }

    @PreDestroy
    public void doMyCleanup() {
        System.out.println("DomenicoPizzeria: inside of doMyCleanup()");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String makePizza(Pizza pizza) {
        return "In making of " + pizza.getName() + " which includes ingredients such as " + pizza.getIngredients();
    }
}
