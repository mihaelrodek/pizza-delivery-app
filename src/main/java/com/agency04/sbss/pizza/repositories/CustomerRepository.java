package com.agency04.sbss.pizza.repositories;

import com.agency04.sbss.pizza.models.rest.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
