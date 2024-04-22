package com.example.SpotifyData.infra;

import org.springframework.http.HttpStatus;

public class DefaultErrorMessage {
    private HttpStatus status;
    private String message;

    public DefaultErrorMessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
