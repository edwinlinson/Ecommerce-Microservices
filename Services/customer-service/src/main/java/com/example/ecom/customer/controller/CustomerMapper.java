package com.example.ecom.customer.controller;

import com.example.ecom.customer.Customer;
import com.example.ecom.customer.CustomerRequest;

public class CustomerMapper {
    public Customer toCustomer(CustomerRequest request){
        return Customer.builder()
                .id(request.id())
                .address(request.address())
                .email(request.email())
                .firstname(request.firstname())
                .lastname(request.lastname())
                .build();
    }
}
