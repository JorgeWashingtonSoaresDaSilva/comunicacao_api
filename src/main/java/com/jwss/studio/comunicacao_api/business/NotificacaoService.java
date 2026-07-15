package com.jwss.studio.comunicacao_api.business;


import com.jwss.studio.comunicacao_api.api.dto.ComunicacaoOutDTO;
import com.jwss.studio.comunicacao_api.infraestructure.client.NotificacaoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NotificacaoService {

    private final NotificacaoClient notificacaoClient;


    public void enviaComunicacaoEmail(ComunicacaoOutDTO dto) {

        notificacaoClient.enviaComunicacaoEmail(dto);
    }


}
