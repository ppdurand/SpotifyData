package com.example.SpotifyData.exceptions;

public class NullTypeException extends RuntimeException{
    public NullTypeException() {
        super("Informe o tipo de pesquisa");
    }
    public NullTypeException(String message){
        super(message);
    }
}
