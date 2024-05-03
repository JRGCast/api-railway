package com.jrgcast.apirailway.entities.card;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Table(name = "card_table")
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "number")
    private String number;
    @Column(name = "security_code")
    private String securityCode;
    @Column(name = "color")
    private String color;
    @Column(name = "total_limit", scale = 2)
    private BigDecimal totalLimit;
}
