package com.example.SpotifyData.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ArtistResponse {
    private String name;
    private ArtistFollowers followers;
    private Integer popularity;

    public ArtistResponse(String name, ArtistFollowers followers, Integer popularity) {
        this.name = name;
        this.followers = followers;
        this.popularity = popularity;
    }

    public ArtistResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArtistFollowers getFollowers() {
        return followers;
    }

    public void setFollowers(ArtistFollowers followers) {
        this.followers = followers;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }
}
