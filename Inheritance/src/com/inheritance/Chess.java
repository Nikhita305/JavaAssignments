package com.inheritance;

public class Chess extends Game {
    public Chess() {
        System.out.println("Running no-arg constructor of Chess");
    }

    @Override
    public void start() {
        System.out.println("Starting a chess match");
    }

    @Override
    public void play() {
        System.out.println("Playing chess with strategy");
    }

    @Override
    public void pause() {
        System.out.println("Pausing the chess match");
    }

    @Override
    public void end() {
        System.out.println("Game over — checkmate!");
    }

    @Override
    public void save() {
        System.out.println("Saving the chess game state");
    }
    public void undo() {
        System.out.println("Undo the chess game state");
    }

}
