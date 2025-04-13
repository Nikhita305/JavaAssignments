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

    @Override
    public int hashCode() {
        return 58;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Song) {
                System.out.println("Ref,compare");
                Song song = this;
                Song song1 = (Song) obj;
                if (song.title.equals(song1.title) && song.artist.equals(song1.artist)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
