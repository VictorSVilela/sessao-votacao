package com.vilela.sessaovotacao.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vilela.sessaovotacao.model.Sessao;
import com.vilela.sessaovotacao.repository.SessaoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SessaoService {

    @Autowired
    private SessaoRepository sessaoRepository;
    public void abrirSessao(Long idPauta, Integer tempoAbertura) {

        log.info("Abrindo sessão {}", idPauta);

        Sessao sessao = new Sessao();
        sessao.setIdPauta(idPauta);
        sessao.setTempoAbertura(tempoAbertura);
        sessao.setDataAbertura(LocalDateTime.now());


        sessaoRepository.save(sessao);
    }

}
