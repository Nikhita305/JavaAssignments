package com.inheritance;

public class Classical extends Music {
    public Classical() {
        System.out.println("Running no-arg constructor of Classical");
    }

    @Override
    public void play() {
        System.out.println("Playing classical raga on sitar");
    }

    @Override
    public void pause() {
        System.out.println("Pausing classical tune");
    }

    @Override
    public void stop() {
        System.out.println("Stopping classical music performance");
    }

    @Override
    public void adjustVolume() {
        System.out.println("Adjusting soft volume for classical music");
    }

    @Override
    public void selectTrack() {
        System.out.println("Selecting a classical raag to perform");
    }

    public void song() {
        System.out.println("Selecting a song of classical to perform");
    }
}
