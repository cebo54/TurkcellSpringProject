package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "notifications")
public class Notification extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String subject;
    private String content;

    @OneToMany(mappedBy = "notification")
    private List<CustomerNotification> customerNotifications;
}
