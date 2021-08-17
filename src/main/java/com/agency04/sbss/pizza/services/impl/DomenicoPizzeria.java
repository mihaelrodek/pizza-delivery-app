package com.agency04.sbss.pizza.services.impl;

import com.agency04.sbss.pizza.models.pizza.MargheritaPizza;
import com.agency04.sbss.pizza.models.pizza.Pizza;
import com.agency04.sbss.pizza.models.pizza.Size;
import com.agency04.sbss.pizza.services.PizzeriaService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Primary
@Service
public class DomenicoPizzeria implements PizzeriaService {

    private String name;
    private String address;
    private List<Pizza> pizzas;
    private List<Size> sizes;

    @PostConstruct
    public void doMyStartup() {
        //System.out.println("DomenicoPizzeria: inside of doMyStartup()");
        name = "Domenico";
        address = "Trg Slobode 7, Varaždin";
        this.pizzas = List.of(new MargheritaPizza());
        this.sizes = List.of(Size.SMALL, Size.MEDIUM, Size.LARGE, Size.EXTRA_LARGE);
    }

    @PreDestroy
    public void doMyCleanup() {
        //System.out.println("DomenicoPizzeria: inside of doMyCleanup()");
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

    @Override
    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @Override
    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }
}
