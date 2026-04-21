package com.victorgabdev.api_genciamento_clima_cidade.service;

import com.victorgabdev.api_genciamento_clima_cidade.dto.cidade.CidadeRequest;
import com.victorgabdev.api_genciamento_clima_cidade.dto.cidade.CidadeResponse;
import com.victorgabdev.api_genciamento_clima_cidade.entity.Cidade;
import com.victorgabdev.api_genciamento_clima_cidade.mapper.CidadeMapper;
import com.victorgabdev.api_genciamento_clima_cidade.repository.CidadeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class CidadeService {

    private final CidadeRepository repository;

    public CidadeService(CidadeRepository repository) {
        this.repository = repository;
    }

    public CidadeResponse cadastraCidade(CidadeRequest cidadeRequest) {
        validaExistenciaCidade(cidadeRequest);

        var cidade = new Cidade(cidadeRequest.nome(), cidadeRequest.estado(), cidadeRequest.pais(), LocalDateTime.now());
        repository.save(cidade);

        return CidadeMapper.cidadeToCidadeResponse(cidade);

    }

    private void validaExistenciaCidade(CidadeRequest cidadeRequest) {
        var cidade = repository.findByNomeAndEstadoAndPais(cidadeRequest.nome(), cidadeRequest.estado(), cidadeRequest.pais());
        if (cidade.isPresent()) throw new RuntimeException("Cidade ja Cadastrada");
    }

}
