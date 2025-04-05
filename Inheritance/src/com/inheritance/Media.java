package com.inheritance;

public class Media {
    public Media() {
        System.out.println("🎧 Media constructor called");
    }

    public void type() {
        System.out.println("Media can be audio, video, or both.");
    }

    public void play() {
        System.out.println("Playing media...");
    }

    public void pause() {
        System.out.println("Pausing media...");
    }

    public void stop() {
        System.out.println("Stopping media...");
    }

    public void share() {
        System.out.println("Sharing media with others.");
    }
}
