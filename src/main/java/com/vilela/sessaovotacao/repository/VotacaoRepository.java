package com.vilela.sessaovotacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vilela.sessaovotacao.model.Votacao;

public interface VotacaoRepository extends JpaRepository<Votacao, Long> {
}
