package com.victorgabdev.api_genciamento_clima_cidade.dto.cidade;

import jakarta.validation.constraints.NotBlank;

public record CidadeRequest (@NotBlank String nome,
                             @NotBlank String estado,
                             @NotBlank String pais) {}
