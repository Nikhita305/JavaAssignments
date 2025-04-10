package com.xworkz.toStringRep;

public class Song {
    private String title;
    private String artist;
    private double duration;

    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        System.out.println("Song Constructor");
    }

    @Override
    public String toString() {
        return "Title: " + this.title + ", Artist: " + this.artist + ", Duration: " + this.duration + " mins";
    }

    public int hashCode() {
        return 58;
    }
}
