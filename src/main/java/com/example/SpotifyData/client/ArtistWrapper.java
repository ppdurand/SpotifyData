package com.example.SpotifyData.client;

import com.example.SpotifyData.model.Artist;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ArtistWrapper {
    private List<Artist> items;

    public ArtistWrapper(List<Artist> items) {
        this.items = items;
    }

    public ArtistWrapper() {
    }

    public List<Artist> getItems() {
        return items;
    }

    public void setItems(List<Artist> items) {
        this.items = items;
    }
}
