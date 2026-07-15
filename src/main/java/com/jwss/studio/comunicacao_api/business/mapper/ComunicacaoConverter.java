package com.jwss.studio.comunicacao_api.business.mapper;

import com.jwss.studio.comunicacao_api.api.dto.ComunicacaoInDTO;
import com.jwss.studio.comunicacao_api.api.dto.ComunicacaoOutDTO;
import com.jwss.studio.comunicacao_api.infraestructure.entities.ComunicacaoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface ComunicacaoConverter {

    @Mapping(source ="dataHoraenvio", target ="dataHoraenvio",dateFormat = "dd-MM-yyyy HH:mm:ss")
    ComunicacaoEntity paraEntity(ComunicacaoInDTO dto);

    ComunicacaoOutDTO paraDTO(ComunicacaoEntity entity);

}
