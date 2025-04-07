package com.inheritance;

public class FoodStall {
    public void serve(Chaats chaats) {
        chaats.name();
        chaats.ingredients();
        chaats.origin();
        chaats.taste();
        chaats.served();

        if (chaats instanceof Panipuri) {
            Panipuri panipuri = (Panipuri) chaats;
            panipuri.spiceLevel();
        }
    }
}
