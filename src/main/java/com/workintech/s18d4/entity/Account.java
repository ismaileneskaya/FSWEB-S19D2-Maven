package com.workintech.s18d4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor
@Entity
@Table(name="account", schema="fsweb")
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="account_name")
    private String accountName;

    @Column(name="money_amount")
    private double moneyAmount;

    @ManyToOne(cascade ={CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH} )
    @JoinColumn(name="customer_id")
    private Customer customer;

}
