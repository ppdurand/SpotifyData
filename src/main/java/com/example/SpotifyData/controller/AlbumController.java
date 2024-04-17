package com.example.SpotifyData.controller;

import com.example.SpotifyData.model.Album;
import com.example.SpotifyData.client.AlbumSpotifyClient;
import com.example.SpotifyData.client.AuthSpotifyClient;
import com.example.SpotifyData.client.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

    private final AuthSpotifyClient authSpotifyClient;
    private final AlbumSpotifyClient albumSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient, AlbumSpotifyClient albumSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.albumSpotifyClient = albumSpotifyClient;
    }


    @GetMapping("/albums")
    public ResponseEntity<List<Album>> listAlbum(){
        var request = new LoginRequest(
                "client_credentials",
                "2838b35e00b7427f81173f748359afa0",
                "4b865f396d624f89b29bdc33fa056067"
        );

        var token = authSpotifyClient.login(request).getAcessToken();
        var response = albumSpotifyClient.getReleases("Bearer " + token);

        return ResponseEntity.ok(response.getAlbums().getItems());
    }
}
