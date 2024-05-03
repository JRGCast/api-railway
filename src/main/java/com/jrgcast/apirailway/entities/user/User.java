package com.jrgcast.apirailway.entities.user;

import com.jrgcast.apirailway.entities.account.Account;
import com.jrgcast.apirailway.entities.bulletin.Bulletin;
import com.jrgcast.apirailway.entities.card.Card;
import com.jrgcast.apirailway.entities.serviceAvailable.ServiceAvailable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "user_entity")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String firstname;
    private String lastname;
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Card> cards;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ServiceAvailable> servicesAvailable;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Bulletin> news;
}
