package com.agency04.sbss.pizza.repositories;

import com.agency04.sbss.pizza.models.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, String> {
}
