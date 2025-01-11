package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products_campaigns")
public class ProductsCampaigns extends BaseEntity{
    @Id
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;

    @ManyToOne
    @JoinColumn(name = "customer_segmantation_id")
    private CustomerSegmentation customerSegmentation;

}
