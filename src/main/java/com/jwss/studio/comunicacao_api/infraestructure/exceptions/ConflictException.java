package com.jwss.studio.comunicacao_api.infraestructure.exceptions;

public class ConflictException extends java.lang.RuntimeException {

    public ConflictException(String mensagem) {
        super(mensagem);
    }

    public ConflictException(String mensagem, Throwable throwable) {
        super(mensagem);
    }

}
