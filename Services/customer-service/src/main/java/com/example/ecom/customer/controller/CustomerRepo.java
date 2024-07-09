package com.example.ecom.customer.controller;

import com.example.ecom.customer.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerRepo extends MongoRepository<Customer,Integer> {

}
