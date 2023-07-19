package com.mgsoft.API_test.model;

import com.mgsoft.API_test.model.Address;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Librairy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_livre;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
