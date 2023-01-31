package com.vilela.sessaovotacao.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vilela.sessaovotacao.model.Votacao;
import com.vilela.sessaovotacao.repository.SessaoRepository;
import com.vilela.sessaovotacao.repository.VotacaoRepository;

@Service
public class VotacaoService {

    private final SessaoRepository sessaoRepository;
    private final VotacaoRepository votacaoRepository;

    public VotacaoService(SessaoRepository sessaoRepository, VotacaoRepository votacaoRepository) {
        this.sessaoRepository = sessaoRepository;
        this.votacaoRepository = votacaoRepository;
    }

    @Transactional
    public void votar(Long idSessao, Boolean voto) {

        Votacao votacao = new Votacao();
        votacao.setSessao(sessaoRepository.findById(idSessao).get());
        votacao.setDataVoto(LocalDateTime.now());
        votacao.setVoto(voto);

        votacaoRepository.save(votacao);
    }

}
