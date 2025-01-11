package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="campaigns")
public class Campaign extends BaseEntity{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
     private String name;
     private Date startDate;
     private Date endDate;
     private String description;


//    @ManyToMany
//    @JoinTable(name = "Product_Campaign",joinColumns = @JoinColumn(name = "campaign_id"),
//            inverseJoinColumns =@JoinColumn(name = "product_id") )
//    private List<Product> productList;
    @OneToMany(mappedBy = "campaign")
    private List<ProductsCampaigns> products_campaigns;


}
