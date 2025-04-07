package com.inheritance;

public class Child {
    public void play(Toy toy) {
        toy.name();
        toy.material();
        toy.color();
        toy.purpose();
        toy.ageGroup();

        if (toy instanceof Teddy) {
            Teddy teddy = (Teddy) toy;
            teddy.hug();
        }
    }
}
