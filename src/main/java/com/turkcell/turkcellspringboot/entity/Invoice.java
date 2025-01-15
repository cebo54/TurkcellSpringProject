package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "invoices")
public class Invoice extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime paymentDate;
    private Double amount;
    private Double discount;
    private Double lateFee;
    private Boolean paidStatus;
    private PaymentMethod paymentMethod;

    @OneToMany(mappedBy = "invoice")
    private List<SubcsriptionInvoice> subscriptionInvoices;
}
