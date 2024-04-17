package com.example.SpotifyData.model;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public class Search {

    @NotNull(message = "Pesquise algo no campo")
    private String q;
    @NotNull(message = "Digite algo no campo")
    private String type;

    public Search(String q, String type) {
        this.q = q;
        this.type = type;
    }

    public Search() {
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
