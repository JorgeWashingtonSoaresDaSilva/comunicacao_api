package com.jwss.studio.comunicacao_api.business.mapper;

import com.jwss.studio.comunicacao_api.api.dto.ComunicacaoInDTO;
import com.jwss.studio.comunicacao_api.api.dto.ComunicacaoOutDTO;
import com.jwss.studio.comunicacao_api.infraestructure.entities.ComunicacaoEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-14T23:42:43-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 24.0.2 (Oracle Corporation)"
)
@Component
public class ComunicacaoConverterImpl implements ComunicacaoConverter {

    @Override
    public ComunicacaoEntity paraEntity(ComunicacaoInDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ComunicacaoEntity.ComunicacaoEntityBuilder comunicacaoEntity = ComunicacaoEntity.builder();

        comunicacaoEntity.dataHoraenvio( dto.getDataHoraenvio() );
        comunicacaoEntity.nomeDestinatario( dto.getNomeDestinatario() );
        comunicacaoEntity.emailDestinatario( dto.getEmailDestinatario() );
        comunicacaoEntity.telefoneDestinatario( dto.getTelefoneDestinatario() );
        comunicacaoEntity.mensagem( dto.getMensagem() );
        comunicacaoEntity.modoDeEnvio( dto.getModoDeEnvio() );
        comunicacaoEntity.statusEnvio( dto.getStatusEnvio() );

        return comunicacaoEntity.build();
    }

    @Override
    public ComunicacaoOutDTO paraDTO(ComunicacaoEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ComunicacaoOutDTO.ComunicacaoOutDTOBuilder comunicacaoOutDTO = ComunicacaoOutDTO.builder();

        comunicacaoOutDTO.dataHoraenvio( entity.getDataHoraenvio() );
        comunicacaoOutDTO.nomeDestinatario( entity.getNomeDestinatario() );
        comunicacaoOutDTO.emailDestinatario( entity.getEmailDestinatario() );
        comunicacaoOutDTO.telefoneDestinatario( entity.getTelefoneDestinatario() );
        comunicacaoOutDTO.mensagem( entity.getMensagem() );
        comunicacaoOutDTO.modoDeEnvio( entity.getModoDeEnvio() );
        comunicacaoOutDTO.statusEnvio( entity.getStatusEnvio() );

        return comunicacaoOutDTO.build();
    }
}
