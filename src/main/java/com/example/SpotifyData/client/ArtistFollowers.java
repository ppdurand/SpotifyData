package com.example.SpotifyData.client;

public class ArtistFollowers {
    private Integer total;

    public ArtistFollowers(Integer total) {
        this.total = total;
    }

    public ArtistFollowers() {
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
