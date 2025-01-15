package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "complaints")
public class Complaint extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private Boolean status;

    @OneToMany(mappedBy = "complaint")
    private List<ComplaintType> complaintTypes;
    @OneToMany(mappedBy = "complaint")
    private List<ComplaintAction>complaintActions;
}
