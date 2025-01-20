package com.br.apitestezemarcelo.controller;

import com.br.apitestezemarcelo.mapper.ProdutoMapper;
import com.br.apitestezemarcelo.model.Produto;
import com.br.apitestezemarcelo.modeljson.ProdutoRequest;
import com.br.apitestezemarcelo.service.ProdutoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.rmi.ServerException;
import java.util.List;

@RestController
@RequestMapping("gereproduto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/consultar/{codigo}")
    public Produto consultar(@PathVariable("codigo") Integer codigo){

        return produtoService.consultar(codigo);
    }

    @PostMapping(path = "inserir", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void inserir(@RequestBody ProdutoRequest produto) throws ServerException {

        produtoService.inserir(produto);
    }

    @GetMapping(path = "listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Produto> listar(){

        return produtoService.listar();
    }


}
