package com.example.SpotifyData.controller;

import com.example.SpotifyData.client.*;
import com.example.SpotifyData.exceptions.NullQueryException;
import com.example.SpotifyData.model.Album;
import com.example.SpotifyData.model.Artist;
import com.example.SpotifyData.model.Search;
import com.example.SpotifyData.model.TrackObject;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<Album>> searchAlbum(@RequestBody Search search){
        if (search.getQ() == null) throw new NullQueryException();

        var request = new LoginRequest(grantType, clientId, clientSecret);
        var token = authSpotifyClient.login(request).getAcessToken();
        var response = searchClient.searchAlbum("Bearer " + token,
                                            search.getQ(), search.getType());

        return ResponseEntity.ok(response.getAlbums().getItems());
    }

    @GetMapping("/artist")
    public ResponseEntity<List<Artist>> searchArtist(@RequestBody @Valid Search search) {
        if (search.getQ() == null) throw new NullQueryException();

        var request = new LoginRequest(grantType, clientId, clientSecret);
        var token = authSpotifyClient.login(request).getAcessToken();
        var response = searchClient.searchArtist("Bearer " + token,
                                                    search.getQ(), search.getType());
        return ResponseEntity.ok(response.getArtists().getItems());
    }

    @GetMapping("/track")
    public ResponseEntity<List<TrackObject>> searchTrack(@RequestBody @Valid Search search){
        if (search.getQ() == null) throw new NullQueryException();

        var request = new LoginRequest(grantType, clientId, clientSecret);
        var token = authSpotifyClient.login(request).getAcessToken();
        var response = searchClient.searchTrack("Bearer " + token,
                search.getQ(), search.getType());

        return ResponseEntity.ok(response.getTracks().getItems());
    }
}
