package com.example.SpotifyData.controller;

import com.example.SpotifyData.client.ArtistResponse;
import com.example.SpotifyData.client.ArtistSpotifyClient;
import com.example.SpotifyData.client.AuthSpotifyClient;
import com.example.SpotifyData.client.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api")
public class ArtistController {
    private final AuthSpotifyClient authSpotifyClient;
    private final ArtistSpotifyClient artistSpotifyClient;

    public ArtistController(AuthSpotifyClient authSpotifyClient, ArtistSpotifyClient artistSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.artistSpotifyClient = artistSpotifyClient;
    }

    @GetMapping("/artist/{id}")
    public ResponseEntity<ArtistResponse> getArtist(@PathVariable String id){
        var request = new LoginRequest(
                "client_credentials",
                "2838b35e00b7427f81173f748359afa0",
                "4b865f396d624f89b29bdc33fa056067"
        );
        var token = authSpotifyClient.login(request).getAcessToken();
        var response = artistSpotifyClient.getArtist("Bearer " + token,
                                                                    id);
        return ResponseEntity.ok(response);
    }
}
