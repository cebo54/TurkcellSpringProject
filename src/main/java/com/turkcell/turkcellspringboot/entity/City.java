package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.util.List;

@Table(name="cities")
@Entity
public class City extends BaseEntity{
    @Id
    private Integer id;
    private String name;

    @OneToMany(mappedBy ="city")
    private List<Address> addresses;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(mappedBy = "city")
    private List<District> district;
}
