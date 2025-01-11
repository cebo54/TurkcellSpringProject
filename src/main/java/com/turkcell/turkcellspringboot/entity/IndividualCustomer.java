package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

@Table(name = "indiviual_customers")
@Entity
public class IndividualCustomer extends BaseEntity{
    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private String nationality;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
