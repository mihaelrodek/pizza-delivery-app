package com.agency04.sbss.pizza.repositories;

import com.agency04.sbss.pizza.models.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, Date> {
}