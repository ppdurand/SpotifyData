package com.example.SpotifyData.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

    @GetMapping("/albums")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok().build();
    }
}
