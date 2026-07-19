package com.jwss.studio.comunicacao_api.api;

import com.jwss.studio.comunicacao_api.api.dto.ComunicacaoInDTO;
import com.jwss.studio.comunicacao_api.api.dto.ComunicacaoOutDTO;
import com.jwss.studio.comunicacao_api.business.service.ComunicacaoService;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Comunicação", description = "Cadastro, Consulta de status e Alteração de status de comunicação")
@RequestMapping("/comunicacao")
public class ComunicacaoController {

    private final ComunicacaoService service;


    public ComunicacaoController(ComunicacaoService service) {
        this.service = service;
    }

    @PostMapping("/agendar")
    @Operation(summary = "Agenda Comunicação", description = "Cria um nova comunicação")
    @ApiResponse(responseCode = "200", description = "Agendado com sucesso")
    @ApiResponse(responseCode = "400", description = "Comunicação não encontrada verifique email esta correto")
    //@ApiResponse(responseCode = "401", description = "Credenciais invalidas ")
    @ApiResponse(responseCode = "409", description = "Conflito")
    @ApiResponse(responseCode = "500", description = "Erro de servidor")
    public ResponseEntity<ComunicacaoOutDTO> agendar(@RequestBody ComunicacaoInDTO dto) {
        return ResponseEntity.ok(service.agendarComunicacao(dto));
    }

    @GetMapping()
    @Operation(summary = "Bucar Comunicação por Email",
            description = "Buscar dados da comunicação")
    @ApiResponse(responseCode = "200", description = "Comunicação encontrada ")
    // @ApiResponse(responseCode = "401", description = "Credenciais invalidas ")
    @ApiResponse(responseCode = "400", description = "Comunicação não encontrada verifique email esta correto")
    @ApiResponse(responseCode = "403", description = "Email não encontrado verifique email esta correto")
    @ApiResponse(responseCode = "500", description = "Erro de servidor")
    public ResponseEntity<ComunicacaoOutDTO> buscarStatus(@RequestParam String emailDestinatario) {

        return ResponseEntity.ok(service.buscarStatusComunicacao(emailDestinatario));
    }

    @PatchMapping("/cancelar")
    @Operation(summary = "Cancela comunição por email",
            description = "Atualiza Status para cancelar")
    @ApiResponse(responseCode = "200", description = "Cancelado com sucesso")
    //@ApiResponse(responseCode = "401", description = "Credenciais invalidas ")
    @ApiResponse(responseCode = "403", description = "Email não encontrado verifique email esta correto")
    @ApiResponse(responseCode = "500", description = "Erro de servidor")
    public ResponseEntity<ComunicacaoOutDTO> cancelarStatus(@RequestParam String emailDestinatario) {
        return ResponseEntity.ok(service.alterarStatusComunicacao(emailDestinatario));
    }
}
