package com.workintech.s18d4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor
@Entity
@Table(name="address", schema="fsweb")
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="street")
    private long street;

    @Column(name="city")
    private String city;

    @Column(name="no")
    private Integer no;

    @Column(name="country")
    private String country;
    
    @Column(name="description")
    private String description;

    @OneToOne(cascade={CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
    private Customer customer;


}
