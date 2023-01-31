package com.vilela.sessaovotacao.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vilela.sessaovotacao.model.Pauta;
import com.vilela.sessaovotacao.repository.PautaRepository;
import com.vilela.sessaovotacao.service.PautaService;
import com.vilela.sessaovotacao.utils.GeneralUtils;
import com.vilela.sessaovotacao.utils.enumerador.ExceptionEnum;

@RestController
@RequestMapping(value = "/pautas")
public class PautaController {

    @Autowired
    private PautaService pautaService;
    @Autowired
    private PautaRepository pautaRepository;

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarPauta(@RequestBody Map<String, String> requestMap) {
        try {
            return pautaService.cadastrarPauta(requestMap);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return GeneralUtils.getResponseError(ExceptionEnum.NAO_POSSIVEL_CADASTRAR, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @GetMapping
    public List<Pauta> listarPautas() {
        return pautaRepository.findAll();
    }
}
