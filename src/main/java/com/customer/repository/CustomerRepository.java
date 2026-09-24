package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.model.CustomerModel;

public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {

}
