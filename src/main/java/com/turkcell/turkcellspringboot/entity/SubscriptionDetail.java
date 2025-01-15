package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "subscription_details")
public class SubscriptionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Double price;

    @OneToMany(mappedBy = "subscriptionDetail")
    private List<Subscription> subscriptions;
}
