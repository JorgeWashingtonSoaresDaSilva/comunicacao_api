package com.jwss.studio.comunicacao_api.infraestructure.exceptions;


public class BusinessException extends java.lang.RuntimeException {
    public BusinessException(String mensagem) {
        super(mensagem);
    }

    public BusinessException(String mensagem, Throwable throwable) {
        super(mensagem, throwable);
    }



}
