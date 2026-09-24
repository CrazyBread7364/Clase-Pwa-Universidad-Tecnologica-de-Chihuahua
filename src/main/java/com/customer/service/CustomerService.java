package com.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.customer.dto.customer;
import com.customer.model.CustomerModel;
import com.customer.repository.CustomerRepository;

@Service 

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<customer> findAll(){
        List<customer> customers = customerRepository.findAll().stream().map(CustomerModel::toDto).toList();
        return customers;
    }

    public customer getCustomer(){
        return customer.builder()
            .id(1)
            .name("memo")
            .phone("123455121")
            .email("memo@gmail.com")
            .build();
    }


}
