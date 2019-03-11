package com.detroitlabs.musicmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistList {

    private List<Artist> artists = new ArrayList<>();

    @Override
    public String toString() {
        return "ArtistList{" +
                "artists=" + artists +
                '}';
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
}
