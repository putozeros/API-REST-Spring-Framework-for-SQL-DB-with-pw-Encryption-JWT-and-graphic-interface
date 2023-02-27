package com.springSQL.spring.models;

import javax.persistence.*;
import lombok.*;


@Entity
@Table(name = "usuarios")
@ToString @Data
public class Usuario {

    @Column(name = "id")
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "password")
    private String password;

}
