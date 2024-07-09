package com.example.ecom.customer.controller;

import com.example.ecom.customer.CustomerRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService ;
    CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<String> createCustomer(
            @RequestBody @Valid CustomerRequest request
    )
    {
        customerService.createCustomer(request);
        return ResponseEntity.ok("created");
    }
}
