package com.example.SpotifyData.client.response;

import com.example.SpotifyData.model.Artist;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SearchArtistResponse {
    private ArtistWrapper artist;

    public SearchArtistResponse(ArtistWrapper artist) {
        this.artist = artist;
    }

    public SearchArtistResponse() {
    }

    public ArtistWrapper getArtist() {
        return artist;
    }

    public void setArtist(ArtistWrapper artist) {
        this.artist = artist;
    }
}
