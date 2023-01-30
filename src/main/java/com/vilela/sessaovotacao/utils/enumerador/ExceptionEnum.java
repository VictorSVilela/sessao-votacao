package com.vilela.sessaovotacao.utils.enumerador;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionEnum {

    NAO_POSSIVEL_CADASTRAR("Não foi possível cadastrar"),
    DADOS_INVALIDOS("Dados inválidos"),
    PAUTA_JA_EXISTE("Pauta já existe");
    private String descricao;
}
