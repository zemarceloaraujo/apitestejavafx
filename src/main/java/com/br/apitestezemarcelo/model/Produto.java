package com.br.apitestezemarcelo.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(schema = "PRODUTO", name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto.sequenceproduto")
    @SequenceGenerator(name = "produto.sequenceproduto", sequenceName = "produto.sequenceproduto", allocationSize = 1)
    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "descricao")
    private String descricao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datacadastro")
    private LocalDateTime dataCadastro;

    @Column(name = "isdisponivel")
    private Boolean isDisponivel;

    @Column(name = "quantidadeestoque")
    private Integer quantidadeEstoque;

    @Column(name = "valorunitario")
    private BigDecimal valorUnitario;

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

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

    public BigDecimal getValorUnitario() {
        return valorUnitario;
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
