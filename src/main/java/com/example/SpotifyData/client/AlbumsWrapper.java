package com.example.SpotifyData.client;

import com.example.SpotifyData.model.Album;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AlbumsWrapper {
    private List<Album> items;

    public AlbumsWrapper(List<Album> items) {
        this.items = items;
    }

    public AlbumsWrapper() {
    }

    public List<Album> getItems() {
        return items;
    }

    public void setItems(List<Album> items) {
        this.items = items;
    }
}
