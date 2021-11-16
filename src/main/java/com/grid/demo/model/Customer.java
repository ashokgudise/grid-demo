package com.grid.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    Long customerId;
    @Column(name = "customer_name",nullable=false)
    String customerName;
    @Column(nullable=false)
    int age;
    @Column(nullable=false)
    char sex;
    @Column(name = "contact_name",nullable=false)
    String contactName;
    @Column(nullable=false)
    String address;
    @Column(nullable=false)
    String city;
    @Column(name = "postal_code",nullable=false)
    String postalCode;
    @Column(nullable=false)
    String country;
}
