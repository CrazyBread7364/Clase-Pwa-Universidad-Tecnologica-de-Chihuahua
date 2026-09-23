package com.customer.model;

import com.customer.dto.customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor 
@Builder 
@Data 
@Entity 
@Table (name = "customer")
public class CustomerModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column  (name = "name", columnDefinition = "VARCHAR(80)")
    private String name;
    @Column (name = "phone", columnDefinition = "VARCHAR(20)")
    private String phone;
    @Column (name = "email", columnDefinition = "VARCHAR(100)")
    private String email;


    public customer toDto(){
        return customer.builder()
                .id(this.id)
                .name(this.name)
                .phone(this.phone)
                .email(this.email)
                .build();
    }

}
