package com.example.SpotifyData.exceptions;

public class NullQueryException extends RuntimeException{

    public NullQueryException() { super("Faça a pesquisa direito");}

    public NullQueryException(String message) {
        super(message);
    }
}
