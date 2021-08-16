package com.agency04.sbss.pizza;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.agency04.sbss.pizza")
@PropertySource("classpath:application.properties")
public class PizzaConfig {

    @Bean
    public PizzeriaService domenicoPizzeria() {
        return new DomenicoPizzeria();
    }

    @Bean
    @Primary
    public PizzeriaService rajPizzeria() {
        return new RajPizzeria();
    }
}

