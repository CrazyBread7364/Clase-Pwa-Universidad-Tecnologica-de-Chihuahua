package com.customer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.customer.dto.customer;
import com.customer.service.CustomerService;

@Controller 
@RequestMapping ("/api/v1")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public ResponseEntity<customer> getById(@RequestParam(name = "id") Integer id){
        customer customer = customerService.getCustomer();
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

}
