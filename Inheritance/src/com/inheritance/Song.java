package com.inheritance;

public class Song extends Media {
    public Song() {
        System.out.println("🎵 Song constructor called");
    }

    @Override
    public void type() {
        System.out.println("This is an audio track - a song.");
    }

    @Override
    public void play() {
        System.out.println("Playing the melody...");
    }

    @Override
    public void pause() {
        System.out.println("Song paused at the chorus.");
    }

    @Override
    public void stop() {
        System.out.println("Song stopped.");
    }

    @Override
    public void share() {
        System.out.println("Sharing the song on social media.");
    }
}
