package com.br.apitestezemarcelo.mapper;

import com.br.apitestezemarcelo.model.Produto;
import com.br.apitestezemarcelo.modeljson.ProdutoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper
public interface ProdutoMapper {

    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);
    Produto map(ProdutoRequest produto);

}
