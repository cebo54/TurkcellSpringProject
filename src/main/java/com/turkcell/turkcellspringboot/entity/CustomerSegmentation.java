package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customer_segmentations")
public class CustomerSegmentation extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "customerSegmentation")
    private List<ProductsCampaigns> productsCampaigns;


}
