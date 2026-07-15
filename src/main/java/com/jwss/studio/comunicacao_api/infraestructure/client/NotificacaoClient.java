package com.jwss.studio.comunicacao_api.infraestructure.client;


import com.jwss.studio.comunicacao_api.api.dto.ComunicacaoOutDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notificacao", url = "${notificacao.url}")

public interface NotificacaoClient {

    @PostMapping
    Void enviaComunicacaoEmail(@RequestBody ComunicacaoOutDTO dto);


}
