package com.mgsoft.API_test.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Librairy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
