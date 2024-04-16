package com.example.SpotifyData.client.response;

import com.example.SpotifyData.client.TracksWrapper;

public class SearchTrackResponse {
    private TracksWrapper tracks;

    public SearchTrackResponse(TracksWrapper tracks) {
        this.tracks = tracks;
    }

    public SearchTrackResponse() {
    }

    public TracksWrapper getTracks() {
        return tracks;
    }

    public void setTracks(TracksWrapper tracks) {
        this.tracks = tracks;
    }
}
