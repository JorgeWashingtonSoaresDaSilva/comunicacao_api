package com.jwss.studio.comunicacao_api.infraestructure.exceptions;

public class ResourceNotFoundException extends java.lang.RuntimeException {
    public ResourceNotFoundException(String mensagem) {

        super(mensagem);
    }

    public ResourceNotFoundException(String mensagem, Throwable throwable) {
        super(mensagem, throwable);
    }

}
