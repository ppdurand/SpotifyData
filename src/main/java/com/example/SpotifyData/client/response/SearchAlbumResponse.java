package com.example.SpotifyData.client.response;

import com.example.SpotifyData.client.AlbumSearchWrapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SearchAlbumResponse {
    private List<AlbumSearchWrapper> items;

    public SearchAlbumResponse(List<AlbumSearchWrapper> items) {
        this.items = items;
    }

    public SearchAlbumResponse() {
    }

    public List<AlbumSearchWrapper> getItems() {
        return items;
    }

    public void setItems(List<AlbumSearchWrapper> items) {
        this.items = items;
    }
}
