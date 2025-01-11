package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
