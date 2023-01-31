package com.vilela.sessaovotacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vilela.sessaovotacao.model.Sessao;

public interface SessaoRepository extends JpaRepository<Sessao, Long> {
}
