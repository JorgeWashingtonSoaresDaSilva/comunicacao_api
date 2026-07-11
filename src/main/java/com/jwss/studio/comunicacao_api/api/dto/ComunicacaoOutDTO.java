package com.jwss.studio.comunicacao_api.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jwss.studio.comunicacao_api.infraestructure.enums.ModoEnvioEnum;
import com.jwss.studio.comunicacao_api.infraestructure.enums.StatusEnvioEnum;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ComunicacaoOutDTO implements Serializable {


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dataHoraEnvio;
    private String nomeDestinatario;
    private String emailDestinatario;
    private String telefoneDestinatario;
    private String mensagem;
    private ModoEnvioEnum modoDeEnvio;
    private StatusEnvioEnum statusEnvio;

}
