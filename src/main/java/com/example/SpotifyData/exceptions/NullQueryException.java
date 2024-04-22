package com.example.SpotifyData.exceptions;

public class NullQueryException extends RuntimeException{

    public NullQueryException() { super("O campo de pesquisa está nulo");}

    public NullQueryException(String message) {
        super(message);
    }
}
