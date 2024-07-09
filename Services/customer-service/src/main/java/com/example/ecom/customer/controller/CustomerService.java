package com.example.ecom.customer.controller;

import com.example.ecom.customer.CustomerRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepo repo;
    private CustomerMapper mapper;

    String createCustomer(CustomerRequest  request){
        var customer = this.repo.save(mapper.toCustomer(request));
        return customer.getEmail();
    }

}
