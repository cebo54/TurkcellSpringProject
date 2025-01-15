package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "complaint_types")
public class ComplaintType extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "complaint_id")
    private Complaint complaint;
}
