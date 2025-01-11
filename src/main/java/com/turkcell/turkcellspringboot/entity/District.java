package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "districties")
public class District extends BaseEntity{
    @Id
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "district")
    private List<Address> addresses;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
