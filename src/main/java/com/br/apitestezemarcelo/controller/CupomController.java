package com.br.apitestezemarcelo.controller;

import com.br.apitestezemarcelo.modeljson.CupomRequest;
import com.br.apitestezemarcelo.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerException;

@RestController
@RequestMapping("gerecupom")
public class CupomController {

    @Autowired
    private CupomService cupomService;

    @PostMapping(path = "inserir", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void inserir(@RequestBody CupomRequest cupomRequest) throws ServerException {

        cupomService.inserir(cupomRequest);
    }
}
