package com.br.apitestezemarcelo.service;

import com.br.apitestezemarcelo.mapper.CupomMapper;
import com.br.apitestezemarcelo.mapper.DetalheCupomMapper;
import com.br.apitestezemarcelo.model.DetalheCupom;
import com.br.apitestezemarcelo.modeljson.CupomRequest;
import com.br.apitestezemarcelo.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static com.br.apitestezemarcelo.mapper.CupomMapper.INSTANCE;

@Service
public class CupomService {

    @Autowired
    private CupomRepository cupomRepository;

    @Transactional
    public void inserir(CupomRequest cupomRequest) {

        List<DetalheCupom> listaDetalhe = new ArrayList<>();

        cupomRequest.getDetalheCupom().stream().forEach(item ->{
            listaDetalhe.add(DetalheCupomMapper.INSTANCE.map(item));
        });

        var cupom =  INSTANCE.map(cupomRequest);
        cupom.setListaDetalhaCupom(listaDetalhe);

        cupomRepository.save(cupom);
    }
}
