package com.example.SpotifyData.client.response;

import com.example.SpotifyData.client.TracksWrapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SearchResponse {
    private TracksWrapper tracks;

    public SearchResponse(TracksWrapper tracks) {
        this.tracks = tracks;
    }

    public SearchResponse() {
    }

    public TracksWrapper getTracks() {
        return tracks;
    }

    public void setTracks(TracksWrapper tracks) {
        this.tracks = tracks;
    }
}
