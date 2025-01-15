package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "subcriptions")
public class Subscription extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "subscription_detail_id")
    private SubscriptionDetail subscriptionDetail;

    @OneToMany(mappedBy = "subscription")
    private List<SubcsriptionInvoice> subscriptionInvoices;

}
