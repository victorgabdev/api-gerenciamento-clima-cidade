package com.victorgabdev.api_genciamento_clima_cidade.controller;

import com.victorgabdev.api_genciamento_clima_cidade.dto.cidade.CidadeRequest;
import com.victorgabdev.api_genciamento_clima_cidade.dto.cidade.CidadeResponse;
import com.victorgabdev.api_genciamento_clima_cidade.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cidade")
public class CidadeController {

    @Autowired
    public CidadeService service;

    @PostMapping
    public ResponseEntity<CidadeResponse> cadastraCidade(@RequestBody CidadeRequest request) {
        var resultado = service.cadastraCidade(request);
        return ResponseEntity.ok(resultado);
    }

}
