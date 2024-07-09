package com.example.ecom.customer;

import jakarta.validation.Valid;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Validated
public class Address {
    private String street;
    private String house;
    private String zipcode;
}
