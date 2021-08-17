package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.services.PizzeriaService;
import com.agency04.sbss.pizza.services.impl.DomenicoPizzeria;
import com.agency04.sbss.pizza.services.impl.RajPizzeria;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.agency04.sbss.pizza")
@PropertySource("classpath:application.properties")
public class PizzaConfig {

    @Bean
    @Primary
    public PizzeriaService domenicoPizzeria() {
        return new DomenicoPizzeria();
    }

    @Bean
    public PizzeriaService rajPizzeria() {
        return new RajPizzeria();
    }
}
