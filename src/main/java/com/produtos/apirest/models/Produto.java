package com.produtos.apirest.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUTOS")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String nome_Produto;

    @NotNull
    private String descricao_Produto;

    @NotNull
    private BigDecimal valor;

    @NotNull
    private int quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_Produto() {
        return nome_Produto;
    }

    public void setNome_Produto(String nomeProduto) {
        this.nome_Produto = nomeProduto;
    }

    public String getDescricao_Produto() {
        return descricao_Produto;
    }

    public void setDescricao_Produto(String descricaoProduto) {
        this.descricao_Produto = descricaoProduto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
