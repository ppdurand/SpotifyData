package com.example.SpotifyData.client;

import com.example.SpotifyData.client.ArtistWrapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SearchArtistResponse {
    private ArtistWrapper artists;

    public SearchArtistResponse(ArtistWrapper artists) {
        this.artists = artists;
    }

    public SearchArtistResponse() {
    }

    public ArtistWrapper getArtists() {
        return artists;
    }

    public void setArtist(ArtistWrapper artists) {
        this.artists = artists;
    }
}
