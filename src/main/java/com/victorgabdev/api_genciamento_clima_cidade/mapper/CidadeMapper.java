package com.victorgabdev.api_genciamento_clima_cidade.mapper;

import com.victorgabdev.api_genciamento_clima_cidade.dto.cidade.CidadeResponse;
import com.victorgabdev.api_genciamento_clima_cidade.entity.Cidade;

public class CidadeMapper {

    public static CidadeResponse cidadeToCidadeResponse(Cidade cidade) {
        return new CidadeResponse(cidade.getNome(),
                cidade.getEstado(),
                cidade.getPais(),
                cidade.getDataCadastro());
    }
}
