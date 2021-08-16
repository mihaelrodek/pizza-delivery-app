package com.agency04.sbss.pizza;

public class Pizzeria implements PizzeriaService{

    @Override
    public String getName() {
        return "Domenico";
    }

    @Override
    public String getAddress() {
        return "Varaždin nešto nešto";
    }
}
