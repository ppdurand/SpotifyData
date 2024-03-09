package com.example.SpotifyData.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SearchAlbumResponse {
    private AlbumSearchWrapper items;

    public SearchAlbumResponse(AlbumSearchWrapper items) {
        this.items = items;
    }
    public SearchAlbumResponse() {
    }

    public AlbumSearchWrapper getItems() {
        return items;
    }

    public void setItems(AlbumSearchWrapper items) {
        this.items = items;
    }
}
