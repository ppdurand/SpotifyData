package com.example.SpotifyData.controller;

import com.example.SpotifyData.client.*;
import com.example.SpotifyData.client.response.SearchAlbumResponse;
import com.example.SpotifyData.client.response.SearchArtistResponse;
import com.example.SpotifyData.model.Artist;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/spotify/api/search")
public class SearchController {
    private final AuthSpotifyClient authSpotifyClient;
    private final SearchClient searchClient;

    public SearchController(AuthSpotifyClient authSpotifyClient, SearchClient searchClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.searchClient = searchClient;
    }


    @GetMapping("/album")
    public ResponseEntity<List<Album>> searchAlbum(@RequestBody Map<String, String> json){
        var request = new LoginRequest(
                "client_credentials",
                "2838b35e00b7427f81173f748359afa0",
                "4b865f396d624f89b29bdc33fa056067"
        );
        var token = authSpotifyClient.login(request).getAcessToken();
        var response = searchClient.search("Bearer " + token,
                                            json.get("q"), json.get("type"));

        return ResponseEntity.ok(response.getAlbums().getItems());
    }

    @GetMapping("/artist")
    public ResponseEntity<SearchArtistResponse> searchArtist() {
        return null;
    }
}
