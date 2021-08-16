package com.agency04.sbss.pizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "domenicoPizzeria")
public class DomenicoPizzeria implements PizzeriaService {

    @Value("Domenico")
    private String name;
    @Value("Trg Slobode 7, Varaždin")
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
