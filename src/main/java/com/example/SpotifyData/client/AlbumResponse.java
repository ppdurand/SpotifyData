package com.example.SpotifyData.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AlbumResponse {
    private AlbumsWrapper albums;

    public AlbumResponse(AlbumsWrapper albums) {
        this.albums = albums;
    }

    public AlbumResponse() {
    }

    public AlbumsWrapper getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumsWrapper albums) {
        this.albums = albums;
    }
}
