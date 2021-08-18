package com.agency04.sbss.pizza.repositories;

import com.agency04.sbss.pizza.models.CustomerDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDetailsRepository extends CrudRepository<CustomerDetails, String> {
}
