package com.inheritance;

public class Game {
    public Game() {
        System.out.println("Running no-arg constructor of Game");
    }

    public void start() {
        System.out.println("Starting the game");
    }

    public void play() {
        System.out.println("Playing the game");
    }

    public void pause() {
        System.out.println("Pausing the game");
    }

    public void end() {
        System.out.println("Ending the game");
    }

    public void save() {
        System.out.println("Saving game progress");
    }
}
