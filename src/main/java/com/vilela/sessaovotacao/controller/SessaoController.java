package com.vilela.sessaovotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vilela.sessaovotacao.service.SessaoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/sessao")
public class SessaoController {

    @Autowired
    private SessaoService sessaoService;

    @PostMapping("/abrir-sessao")
    public ResponseEntity abrirSessao(Long idPauta, Integer tempoAbertura) {
        sessaoService.abrirSessao(idPauta, tempoAbertura);
        return ResponseEntity.ok().build();
    }

}
