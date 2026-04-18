package com.victorgabdev.api_genciamento_clima_cidade.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cidade")
public class CidadeController {

    @PostMapping
    public ResponseEntity<?> cadastraCidade() {
        return ResponseEntity.ok("Testa");
    }
}
