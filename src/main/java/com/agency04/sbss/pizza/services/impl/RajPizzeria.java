package com.agency04.sbss.pizza.services.impl;

import com.agency04.sbss.pizza.models.pizza.Pizza;
import com.agency04.sbss.pizza.services.PizzeriaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RajPizzeria implements PizzeriaService {
    @Value("${foo.name}")
    private String name;
    @Value("${foo.address}")
    private String address;

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
        return "In making of " +  pizza.getName() + " which includes ingredients such as "+pizza.getIngredients();
    }
}
