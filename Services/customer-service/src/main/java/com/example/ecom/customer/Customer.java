package com.example.ecom.customer;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Document
public class Customer {
    @Id
    private int id;

    private String firstname;
    private String lastname;
    private String email;
    private Address address;
}
