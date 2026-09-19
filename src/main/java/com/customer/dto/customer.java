package com.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder 
@AllArgsConstructor 
@Data 

public class customer {

    private Integer id;
    private String name;
    private String phone;
    private String email;

    
}
