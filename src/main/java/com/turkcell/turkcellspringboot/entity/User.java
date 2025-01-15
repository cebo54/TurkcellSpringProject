package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<UserOperationClaim> userOperationClaims;

    @OneToMany(mappedBy = "user")
    private List<UserRole> userRoles;
}
