package com.victorgabdev.api_genciamento_clima_cidade.entity;

import com.victorgabdev.api_genciamento_clima_cidade.entity.enums.Origem;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tab_consulta_clima")
public class ConsultaClima {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID cidadeId;
    private String descricao;
    private Integer umidade;
    private LocalDateTime dataConsulta;
    private Origem origem;

    public ConsultaClima() {
    }

    public ConsultaClima(UUID id, UUID cidadeId, String description, Integer umidade, LocalDateTime dataConsulta, Origem origem) {
        this.id = id;
        this.cidadeId = cidadeId;
        this.descricao = description;
        this.umidade = umidade;
        this.dataConsulta = dataConsulta;
        this.origem = origem;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(UUID cidadeId) {
        this.cidadeId = cidadeId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getUmidade() {
        return umidade;
    }

    public void setUmidade(Integer umidade) {
        this.umidade = umidade;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ConsultaClima that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
