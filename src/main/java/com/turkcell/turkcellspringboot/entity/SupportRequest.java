package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "support_requests")
public class SupportRequest extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private RequestStatus requestStatus;
    private RequestType requestType;

    // user id olacak
}
