package com.victorgabdev.api_genciamento_clima_cidade.repository;

import com.victorgabdev.api_genciamento_clima_cidade.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, UUID> {

    List<Cidade> findAllByNome(String nome);
    Optional<Cidade> findByNomeAndEstadoAndPais(String nome, String estado, String pais);

}
