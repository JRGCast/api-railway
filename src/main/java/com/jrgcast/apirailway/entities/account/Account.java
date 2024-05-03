package com.jrgcast.apirailway.entities.account;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "account_table")
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "number", unique = true)
    private String number;
    @Column(name = "agency")
    private String agency;
    @Column(name = "balance", scale = 2)
    private BigDecimal balance;
    @Column(name = "extra_limit", scale = 2)
    private BigDecimal extraLimit;
}
