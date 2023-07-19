package com.mgsoft.API_test.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nom;
}
