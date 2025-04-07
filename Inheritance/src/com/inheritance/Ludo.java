package com.inheritance;

public class Ludo {
    public void play(Game game){
        game.play();
        game.save();
        game.pause();
        game.start();
        game.pause();

        if(game instanceof Chess){
            Chess chess =(Chess) game;
            chess.undo();
        }
    }
}
