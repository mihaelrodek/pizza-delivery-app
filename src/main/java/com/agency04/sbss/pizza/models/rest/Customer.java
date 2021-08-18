package com.agency04.sbss.pizza.models.rest;

import com.agency04.sbss.pizza.models.CustomerDetails;
import com.agency04.sbss.pizza.models.Delivery;
import com.agency04.sbss.pizza.models.Sex;
import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
public class Customer {

    @Id
    private String username;

    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "username")
    private CustomerDetails customerDetails;

    @JsonIgnore
    @OneToMany(mappedBy = "customer")
    private List<Delivery> deliveries;

    public Customer() {
    }

    public Customer(String username, CustomerDetails customerDetails, List<Delivery> deliveries) {
        this.username = username;
        this.customerDetails = customerDetails;
        this.deliveries = deliveries;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
        this.customerDetails.setCustomer(this);
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (!Objects.equals(username, customer.username)) return false;
        return Objects.equals(customerDetails, customer.customerDetails);
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (customerDetails != null ? customerDetails.hashCode() : 0);
        return result;
    }
}
