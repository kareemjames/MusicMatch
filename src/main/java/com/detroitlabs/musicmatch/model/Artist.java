package com.detroitlabs.musicmatch.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {

    private int artist_id;
    private String artist_name;
    private String artist_country;
    private int artist_rating;

    @Override
    public String toString() {
        return "Artist{" +
                "artist_id=" + artist_id +
                ", artist_name='" + artist_name + '\'' +
                ", artist_country='" + artist_country + '\'' +
                ", artist_rating=" + artist_rating +
                '}';
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getArtist_country() {
        return artist_country;
    }

    public void setArtist_country(String artist_country) {
        this.artist_country = artist_country;
    }

    public int getArtist_rating() {
        return artist_rating;
    }

    public void setArtist_rating(int artist_rating) {
        this.artist_rating = artist_rating;
    }
}

