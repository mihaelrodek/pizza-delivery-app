package com.agency04.sbss.pizza.repositories;

import com.agency04.sbss.pizza.models.pizza.Pizza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, String> {
}
