package com.br.apitestezemarcelo.modeljson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.math.BigDecimal;

@JsonTypeName("detalheCupom")
public class DetalheCupomRequest {

    @JsonProperty("codigoProduto")
    private Integer codigoProduto;

    @JsonProperty("valorUnitario")
    private BigDecimal valorUnitario;

    @JsonProperty("valorLogico")
    private BigDecimal valorLogico;

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public BigDecimal getValorLogico() {
        return valorLogico;
    }

    public void setCodigoProduto(Integer codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setValorLogico(BigDecimal valorLogico) {
        this.valorLogico = valorLogico;
    }
}
