package com.br.apitestezemarcelo.modeljson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@JsonTypeName("cupom")
public class CupomRequest {

    @JsonProperty("dataCadastro")
    private LocalDateTime dataCadastro;

    @JsonProperty("dataFechamento")
    private LocalDateTime dataFechamento;

    @JsonProperty("valorTotal")
    private BigDecimal valorTotal;

    @JsonProperty("detalheCupom")
    private List<DetalheCupomRequest> listaDetalheCupom;

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setDataFechamento(LocalDateTime dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setDetalheCupom(List<DetalheCupomRequest> detalheCupom) {
        this.listaDetalheCupom = detalheCupom;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public List<DetalheCupomRequest> getDetalheCupom() {
        return listaDetalheCupom;
    }
}
