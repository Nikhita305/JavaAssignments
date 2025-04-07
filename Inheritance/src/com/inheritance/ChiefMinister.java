package com.inheritance;

public class ChiefMinister {
    public void manage(State state) {
        state.name();
        state.language();
        state.capital();
        state.famousFor();
        state.population();

        if (state instanceof Karnataka) {
            Karnataka karnataka = (Karnataka) state;
            karnataka.schemes();
        }
    }
}
