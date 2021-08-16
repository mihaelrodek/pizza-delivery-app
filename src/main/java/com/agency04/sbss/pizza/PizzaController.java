package com.agency04.sbss.pizza;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class PizzaController {

    @GetMapping("/")
    public String sayHello() {
        return "Welcome to pizza app!";
    }
}

