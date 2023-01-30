package com.vilela.sessaovotacao.service;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vilela.sessaovotacao.model.Pauta;
import com.vilela.sessaovotacao.repository.PautaRepository;
import com.vilela.sessaovotacao.utils.GeneralUtils;
import com.vilela.sessaovotacao.utils.enumerador.ExceptionEnum;

@Service
public class PautaService {

    @Autowired
    PautaRepository pautaRepository;

    public ResponseEntity<String> cadastrarPauta(Map<String, String> requestMap) {
        try {
            if (validarCadastro(requestMap)) {
                Pauta pauta = pautaRepository.findById(Long.valueOf(requestMap.get("id_pauta"))).get();
                if (Objects.isNull(pauta)) {
                    pautaRepository.save(getPautaMap(requestMap));
                    return GeneralUtils.getResponseSuccess("Cadastro Realizado com Sucesso", HttpStatus.OK);
                } else {
                    return GeneralUtils.getResponseError(ExceptionEnum.PAUTA_JA_EXISTE, HttpStatus.BAD_REQUEST);
                }
            } else {
                return GeneralUtils.getResponseError(ExceptionEnum.DADOS_INVALIDOS, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return GeneralUtils.getResponseError(ExceptionEnum.NAO_POSSIVEL_CADASTRAR, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private boolean validarCadastro(Map<String, String> requestMap) {
        if (requestMap.containsKey("descricao")) {
            return true;
        }
        return false;
    }

    private Pauta getPautaMap(Map<String, String> requestMap) {
        Pauta pauta = new Pauta();
        pauta.setDescricao(requestMap.get("descricao"));
        return pauta;
    }

}
