package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

@Table(name = "addresses")
@Entity
public class Address extends BaseEntity{
    @Id
    private Integer id;
    private String description;
    private String street;
    private String houseNumber;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
