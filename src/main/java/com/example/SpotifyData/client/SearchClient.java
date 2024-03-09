package com.example.SpotifyData.client;

import feign.Headers;
import feign.Param;
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

    @GetMapping(value ="/search?q={q}&type={type}")
    SearchAlbumResponse search(@RequestHeader("Authorization") String authorization,
                          @RequestParam("q") String q, @RequestParam("type") String type);
}
