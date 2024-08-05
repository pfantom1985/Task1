package org.example;

import java.time.LocalDateTime;
//TODO список жанров.
public class Vote {
    private String artist;
    private String genre;
    private String about;
    private LocalDateTime dateTime;

    public Vote(String artist, String genre, String about, LocalDateTime dateTime) {
        this.artist = artist;
        this.genre = genre;
        this.about = about;
        this.dateTime = dateTime;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public String getAbout() {
        return about;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}