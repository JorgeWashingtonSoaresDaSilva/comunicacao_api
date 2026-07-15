package com.jwss.studio.comunicacao_api.infraestructure.entities;

import com.jwss.studio.comunicacao_api.infraestructure.enums.ModoEnvioEnum;
import com.jwss.studio.comunicacao_api.infraestructure.enums.StatusEnvioEnum;
import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "COMUNICACAO")
public class ComunicacaoEntity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "HORA_ENVIO", nullable = false)
    private Date dataHoraenvio;

    @Column(name = "NOME_DESTINATARIO", nullable = false)
    private String nomeDestinatario;

    @Column(name = "EMAIL_DESTINATARIO", nullable = false, unique = true)
    private String emailDestinatario;

    @Column(name = "TELEFONE_DESTINATARIO")
    private String telefoneDestinatario;

    @Column(name = "MENSAGEM", nullable = false)
    private String mensagem;

    @Column(name = "MODO_ENVIO")
    @Enumerated(EnumType.STRING)
    private ModoEnvioEnum modoDeEnvio;

    @Column(name = "STATUS_ENVIO")
    @Enumerated(EnumType.STRING)
    private StatusEnvioEnum statusEnvio;

}
