package com.detroitlabs.musicmatch.service;

import com.detroitlabs.musicmatch.model.Music;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MusicService {

    public Music fetchAllMusic() {

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject("https://api.musixmatch.com/ws/1.1/artist.search?format=json&callback=callback&q_artist=madonna&apikey=316b00e1aaab46de8818913129f89905", Music.class );
    }
}
