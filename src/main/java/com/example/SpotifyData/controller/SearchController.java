package com.example.SpotifyData.controller;

import com.example.SpotifyData.client.*;
import com.example.SpotifyData.model.Artist;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.spel.ast.BeanReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Track;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/spotify/api/search")
public class SearchController {
    private final AuthSpotifyClient authSpotifyClient;
    private final SearchClient searchClient;

    @Value("${grantType}")
    private String grantType;
    @Value("${clientId}")
    private String clientId;
    @Value("${clientSecret}")
    private String clientSecret;

    public SearchController(AuthSpotifyClient authSpotifyClient, SearchClient searchClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.searchClient = searchClient;
    }


    @GetMapping("/album")
    public ResponseEntity<List<Album>> searchAlbum(@RequestBody Map<String, String> json){
        var request = new LoginRequest(grantType, clientId, clientSecret);
        var token = authSpotifyClient.login(request).getAcessToken();
        var response = searchClient.searchAlbum("Bearer " + token,
                                            json.get("q"), json.get("type"));

        return ResponseEntity.ok(response.getAlbums().getItems());
    }

    @GetMapping("/artist")
    public ResponseEntity<List<Artist>> searchArtist(@RequestBody Map<String, String> json) {
        var request = new LoginRequest(grantType, clientId, clientSecret);
        var token = authSpotifyClient.login(request).getAcessToken();
        var response = searchClient.searchArtist("Bearer " + token,
                                                    json.get("q"), json.get("type"));
        return ResponseEntity.ok(response.getArtist().getItems());
    }

    @GetMapping("/track")
    public ResponseEntity<List<TrackObject>> searchTrack(@RequestBody Map<String, String> json){
        var request = new LoginRequest(grantType, clientId, clientSecret);
        var token = authSpotifyClient.login(request).getAcessToken();
        var response = searchClient.searchTrack("Bearer " + token,
                json.get("q"), json.get("type"));

        return ResponseEntity.ok(response.getTracks().getItems());
    }
}
