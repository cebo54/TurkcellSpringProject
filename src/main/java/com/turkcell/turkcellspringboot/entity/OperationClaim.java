package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "operation_claims")
public class OperationClaim extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "operationClaim")
    private List<UserOperationClaim> userOperationClaims;

    @OneToMany(mappedBy = "operationClaim")
    private List<RoleOperationClaim> roleOperationClaims;

}
