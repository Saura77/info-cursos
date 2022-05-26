package com.example.cursoflor.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "votantes")
public class Votante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "El campo debe contener al menos un caracter")
    private String name;

    @NotEmpty(message = "El campo debe contener al menos un caracter")
    private String lastname;
    private int vote;

}
