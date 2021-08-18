package com.agency04.sbss.pizza.repositories;

import com.agency04.sbss.pizza.models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Date> {
}