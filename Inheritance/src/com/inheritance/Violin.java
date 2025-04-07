package com.inheritance;

public class Violin {
    public void play(Instrument instrument){
        instrument.play();
        instrument.carry();
        instrument.polish();
        instrument.store();
        instrument.tune();

        if(instrument instanceof Guitar){
            Guitar guitar = (Guitar)instrument;
            guitar.clean();
        }
    }
}
