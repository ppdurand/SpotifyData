package com.example.SpotifyData.controller;

import com.example.SpotifyData.client.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spotify/api")
public class SearchController {
    private final AuthSpotifyClient authSpotifyClient;
    private final SearchClient searchClient;

    public SearchController(AuthSpotifyClient authSpotifyClient, SearchClient searchClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.searchClient = searchClient;
    }


    @GetMapping("/search")
    public ResponseEntity<SearchAlbumResponse> search(){
        var request = new LoginRequest(
                "client_credentials",
                "2838b35e00b7427f81173f748359afa0",
                "4b865f396d624f89b29bdc33fa056067"
        );
        var token = authSpotifyClient.login(request).getAcessToken();
        var response = searchClient.search("Bearer " + token,
                                            "Verniz", "album");

        return ResponseEntity.ok(response);
    }
}
