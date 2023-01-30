package com.vilela.sessaovotacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vilela.sessaovotacao.model.Pauta;

public interface PautaRepository extends JpaRepository<Pauta, Long> {
}
