package com.jponchiroli.learn.up;

import jakarta.persistence.*;

@Entity
@Table(name = "teste")
public class Teste {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
}
