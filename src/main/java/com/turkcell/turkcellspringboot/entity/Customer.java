package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    private String email;
//    private String phone;
//    private Date createdDate;
//    private Date updatedDate;
//    private String address;
    @OneToOne(mappedBy = "customer")
    private IndividualCustomer individualCustomer;
    @OneToOne(mappedBy = "customer")
    private CorporateCustomer corporateCustomer;
    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;


}
