package com.inheritance;

public class Chef {
    public void cook(Vegetable vegetable) {
        vegetable.name();
        vegetable.color();
        vegetable.taste();
        vegetable.nutrients();
        vegetable.season();

        if (vegetable instanceof Onion) {
            Onion onion = (Onion) vegetable;
            onion.peel();
        }
    }
}
