package com.agency04.sbss.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) {

        try {
            SpringApplication.run(PizzaApp.class, args);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}


