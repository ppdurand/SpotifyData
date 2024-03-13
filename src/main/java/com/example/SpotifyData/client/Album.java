package com.example.SpotifyData.client;

import com.example.SpotifyData.model.Artist;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Album {
    private String id;
    private String name;
    private String releaseDate;
    private List<Artist> artists;

    public Album(String id, String name, String releaseDate, List<Artist> artists) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.artists = artists;
    }

    public Album() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Artist> getArtist() {
        return artists;
    }

    public void setArtist(List<Artist> artists) {
        this.artists = artists;
    }
}
