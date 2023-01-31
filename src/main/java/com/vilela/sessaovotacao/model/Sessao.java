package com.vilela.sessaovotacao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@Table(name = "tbl_sessao")
public class Sessao implements Serializable {

    @Id
    @Column(name = "id_sessao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_sessao;

    @Column(name="data_abertura")
    private LocalDateTime dataAbertura;

    @Column(name = "id_pauta")
    private Long idPauta;

    @Column(name = "tempo_abertura")
    private Integer tempoAbertura = 1;
}
