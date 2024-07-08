package com.example.ecom.customer;

import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Validated
public class Address {
    private String street;
    private String house;
    private String zipcode;
}
