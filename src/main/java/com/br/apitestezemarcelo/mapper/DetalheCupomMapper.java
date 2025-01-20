package com.br.apitestezemarcelo.mapper;

import com.br.apitestezemarcelo.model.DetalheCupom;
import com.br.apitestezemarcelo.modeljson.DetalheCupomRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DetalheCupomMapper {

    DetalheCupomMapper INSTANCE = Mappers.getMapper(DetalheCupomMapper.class);
    DetalheCupom map(DetalheCupomRequest detalheCupomRequest);

}
