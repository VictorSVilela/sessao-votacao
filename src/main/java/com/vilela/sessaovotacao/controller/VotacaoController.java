package com.vilela.sessaovotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vilela.sessaovotacao.model.Sessao;
import com.vilela.sessaovotacao.service.VotacaoService;

@RestController
@RequestMapping("/votacao")
public class VotacaoController {

    @Autowired
    private VotacaoService votacaoService;

    @PostMapping("/votar")
    public ResponseEntity<Sessao> votar(Long idSessao, Boolean voto) {
        votacaoService.votar(idSessao, voto);
        return ResponseEntity.ok().build();
    }
}
