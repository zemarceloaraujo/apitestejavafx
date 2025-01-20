package com.br.apitestezemarcelo.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(schema = "PRODUTO", name = "DETALHECUPOM")
public class DetalheCupom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto.sequencedetalhecupom")
    @SequenceGenerator(name = "produto.sequencedetalhecupom", sequenceName = "produto.sequencedetalhecupom", allocationSize = 1)
    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "codigo_produto")
    private Integer codigoProduto;

    @Column(name = "valor_unitario")
    private BigDecimal valorUnitario;

    @Column(name = "valor_logico")
    private BigDecimal valorLogico;

    @ManyToOne
    @JoinColumn(name = "numero_cupom")
    private Cupom cupom;

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getCodigoProduto() {
        return codigoProduto;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public BigDecimal getValorLogico() {
        return valorLogico;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public void setCupom(Cupom cupom) {
        this.cupom = cupom;
    }

    public Cupom getCupom() {
        return cupom;
    }
}
