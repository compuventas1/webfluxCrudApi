package com.webfluxapi.webfluxapi.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre")
    private String nombres;

    @Column(name="apellidopaterno")
    private String apellidoPaterno;

    @Column(name="apellidomaterno")
    private String apellidoMaterno;

    @Column(name="sexo")
    private String sexo;

    @Column(name="email")
    private String email;

}
