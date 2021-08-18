package com.agency04.sbss.pizza.repositories;

import com.agency04.sbss.pizza.models.pizza.PizzaOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaOrderRepository extends CrudRepository<PizzaOrder, Long> {
}
