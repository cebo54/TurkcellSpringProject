package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "countries")
public class Country extends BaseEntity{
    @Id
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "country")
    private List<Address> addresses;
    @OneToMany(mappedBy = "country")
    private List<City> cities;

}
