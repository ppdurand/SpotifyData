package com.example.SpotifyData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpotifyDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifyDataApplication.class, args);
	}

}
