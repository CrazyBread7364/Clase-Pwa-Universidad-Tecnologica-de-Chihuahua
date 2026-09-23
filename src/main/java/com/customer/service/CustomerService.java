package com.customer.service;

import org.springframework.stereotype.Service;

import com.customer.dto.customer;

@Service 

public class CustomerService {


    public customer getCustomer(){
        return customer.builder()
            .id(1)
            .name("memo")
            .phone("123455121")
            .email("memo@gmail.com")
            .build();
    }


}
