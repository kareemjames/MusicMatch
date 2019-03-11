package com.detroitlabs.musicmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {

    private ArtistList artistList;

    @Override
    public String toString() {
        return "Body{" +
                "artistList=" + artistList +
                '}';
    }

    @JsonProperty("artist_list")
    public ArtistList getArtistList() {
        return artistList;
    }

    @JsonProperty("artist_list")
    public void setArtistList(ArtistList artistList) {
        this.artistList = artistList;
    }
}
