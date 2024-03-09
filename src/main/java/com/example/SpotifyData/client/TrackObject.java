package com.example.SpotifyData.client;

public class TrackObject {
    private String name;
    private ArtistResponse artists;

    public TrackObject(String name, ArtistResponse artists) {
        this.name = name;
        this.artists = artists;
    }

    public TrackObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArtistResponse getArtists() {
        return artists;
    }

    public void setArtists(ArtistResponse artists) {
        this.artists = artists;
    }
}
