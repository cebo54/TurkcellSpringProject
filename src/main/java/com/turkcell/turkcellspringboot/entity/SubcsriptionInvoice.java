package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "subscription_invoices")
public class SubcsriptionInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;
    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;
}
