package com.example.SpotifyData.client;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
       name = "SearchClient",
        url = "https://api.spotify.com/v1"
)
@Headers("Content-Type: application/json")
public interface SearchClient {

    @GetMapping("/search?q={q}&type={type}")
    AlbumResponse searchAlbum(@RequestHeader("Authorization") String authorization,
                              @RequestParam("q") String q, @RequestParam("type") String type);

    @GetMapping("/search?q={q}&type={type}")
    SearchArtistResponse searchArtist(@RequestHeader("Authorization") String authorization,
                                      @RequestParam("q") String q, @RequestParam("type") String type);

    @GetMapping("/search?q={q}&type={type}")
    AlbumSpotifyClient.SearchTrackResponse searchTrack(@RequestHeader("Authorization") String authorization,
                                                       @RequestParam("q") String q, @RequestParam("type") String type);
}