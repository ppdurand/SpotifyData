package com.example.SpotifyData.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        name = "AlbumSpotifyClient",
        url = "https://api.spotify.com"
)
public interface AlbumSpotifyClient {
    @GetMapping("/v1/browse/new-releases")
    AlbumResponse getReleases(@RequestHeader("Authorization") String authorization);

    class SearchTrackResponse {
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

        @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
        public static class SearchResponse {
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
    }
}
