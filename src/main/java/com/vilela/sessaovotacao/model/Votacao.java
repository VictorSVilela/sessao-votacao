package com.vilela.sessaovotacao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_votacao")
public class Votacao implements Serializable {

    @Id
    @Column(name = "id_votacao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_votacao;

    @Column(name = "voto")
    private Boolean voto;

}
