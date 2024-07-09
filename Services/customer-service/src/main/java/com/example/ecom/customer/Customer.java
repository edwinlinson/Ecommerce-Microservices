package com.example.ecom.customer;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
@Document
public class Customer {
    @Id
    private int id;

    private String firstname;
    private String lastname;
    private String email;
    private Address address;
}
