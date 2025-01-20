package com.br.apitestezemarcelo.service;

import com.br.apitestezemarcelo.mapper.ProdutoMapper;
import com.br.apitestezemarcelo.model.Produto;
import com.br.apitestezemarcelo.modeljson.ProdutoRequest;
import com.br.apitestezemarcelo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public void inserir(ProdutoRequest produto) {

        produtoRepository.save(ProdutoMapper.INSTANCE.map(produto));
    }

    public Produto consultar(Integer codigo) {

        return produtoRepository.consultar(codigo).get();
    }

    public List<Produto> listar() {

        return produtoRepository.findAll();
    }
}
