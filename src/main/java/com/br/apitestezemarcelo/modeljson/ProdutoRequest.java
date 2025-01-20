package com.br.apitestezemarcelo.modeljson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDateTime;

@JsonTypeName("produtoRequest")
public class ProdutoRequest {

    @JsonProperty("codigo")
    private Integer codigo;

    @JsonProperty("descricao")
    private String descricao;

    @JsonProperty("dataCadastro")
    private LocalDateTime dataCadastro;

    @JsonProperty("isDisponivel")
    private Boolean isDisponivel;

    @JsonProperty("quantidadeEstoque")
    private Integer quantidadeEstoque;


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setDisponivel(Boolean disponivel) {
        isDisponivel = disponivel;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public Boolean getDisponivel() {
        return isDisponivel;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
