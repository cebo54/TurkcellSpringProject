package com.turkcell.turkcellspringboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "role_operation_claims")
public class RoleOperationClaim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "operation_claim_id")
    private OperationClaim operationClaim;

}
