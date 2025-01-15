package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "complaint_actions")
public class ComplaintAction extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime createdAt;
    private String takenBy;

    @ManyToOne
    @JoinColumn(name = "complaint_id")
    private Complaint complaint;

}
