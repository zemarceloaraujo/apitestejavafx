package com.br.apitestezemarcelo.model;

import com.br.apitestezemarcelo.repository.CupomRepository;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(schema = "PRODUTO", name = "CUPOM")
public class Cupom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto.sequencecupom")
    @SequenceGenerator(name = "produto.sequencecupom", sequenceName = "produto.sequencecupom", allocationSize = 1)
    @Column(name = "numero_cupom")
    private Integer numeroCupom;

    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro;

    @Column(name = "data_fechamento")
    private LocalDateTime dataFechamento;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @OneToMany(mappedBy = "cupom", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalheCupom> listaDetalheCupom;

    public Integer getNumeroCupom() {
        return numeroCupom;
    }

    public List<DetalheCupom> getListaDetalhaCupom() {
        return listaDetalheCupom;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setListaDetalhaCupom(List<DetalheCupom> listaDetalhaCupom) {
        this.listaDetalheCupom = listaDetalhaCupom;
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setNumeroCupom(Integer numeroCupom) {
        this.numeroCupom = numeroCupom;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setDataFechamento(LocalDateTime dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
