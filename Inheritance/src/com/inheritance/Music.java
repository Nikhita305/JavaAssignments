package com.inheritance;

public class Music {
    public Music() {
        System.out.println("Running no-arg constructor of Music");
    }

    public void play() {
        System.out.println("Playing music");
    }

    public void pause() {
        System.out.println("Pausing music");
    }

    public void stop() {
        System.out.println("Stopping music");
    }

    public void adjustVolume() {
        System.out.println("Adjusting music volume");
    }

    public void selectTrack() {
        System.out.println("Selecting a track to play");
    }
}
