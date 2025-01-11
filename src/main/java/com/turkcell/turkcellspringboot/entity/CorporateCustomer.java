package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "corporate_customers")
public class CorporateCustomer extends BaseEntity{
    @Id
    private Integer id;
    private String name;
    private String taxId;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
