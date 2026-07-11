package com.jwss.studio.comunicacao_api.business.converter;

import com.jwss.studio.comunicacao_api.api.dto.ComunicacaoInDTO;
import com.jwss.studio.comunicacao_api.api.dto.ComunicacaoOutDTO;
import com.jwss.studio.comunicacao_api.infraestructure.entities.ComunicacaoEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ComunicacaoConverter {

    public ComunicacaoEntity paraEntity(ComunicacaoInDTO dto) {
        return ComunicacaoEntity.builder()
                .dataHoraenvio(dto.getDataHoraEnvio())
                .emailDestinatario(dto.getEmailDestinatario())
                .nomeDestinatario(dto.getNomeDestinatario())
                .mensagem(dto.getMensagem())
                .modoDeEnvio(dto.getModoDeEnvio())
                .statusEnvio(dto.getStatusEnvio())
                .telefoneDestinatario(dto.getTelefoneDestinatario())
                .build();
    }

    public ComunicacaoOutDTO paraDTO(ComunicacaoEntity entity) {
        return ComunicacaoOutDTO.builder()
                .dataHoraEnvio(entity.getDataHoraenvio())
                .emailDestinatario(entity.getEmailDestinatario())
                .nomeDestinatario(entity.getNomeDestinatario())
                .mensagem(entity.getMensagem())
                .modoDeEnvio(entity.getModoDeEnvio())
                .telefoneDestinatario(entity.getTelefoneDestinatario())
                .statusEnvio(entity.getStatusEnvio())
                .build();
    }
}
