package com.victorgabdev.api_genciamento_clima_cidade.dto.cidade;

import java.time.LocalDateTime;

public record CidadeResponse(String nome,
                             String estado,
                             String pais,
                             LocalDateTime dataCadastro) {

}
