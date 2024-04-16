package com.example.SpotifyData.client.response;

import com.example.SpotifyData.model.Artist;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

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
