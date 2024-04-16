package com.example.SpotifyData.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TrackObject {
    private String name;
    private List<ArtistResponse> artists;
    private Album album;

    public TrackObject(String name, List<ArtistResponse> artists, Album album) {
        this.name = name;
        this.artists = artists;
        this.album = album;
    }

    public TrackObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ArtistResponse> getArtists() {
        return artists;
    }

    public void setArtists(List<ArtistResponse> artists) {
        this.artists = artists;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
