package com.br.apitestezemarcelo.mapper;

import com.br.apitestezemarcelo.model.Cupom;
import com.br.apitestezemarcelo.modeljson.CupomRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CupomMapper {

    CupomMapper INSTANCE = Mappers.getMapper(CupomMapper.class);
    Cupom map(CupomRequest cupomRequest);
}
