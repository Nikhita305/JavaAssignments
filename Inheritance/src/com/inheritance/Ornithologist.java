package com.inheritance;

public class Ornithologist {
    public void observe(Bird bird) {
        bird.fly();
        bird.sing();
        bird.buildNest();
        bird.eat();
        bird.migrate();

        if (bird instanceof Parrot) {
            Parrot parrot = (Parrot) bird;
            parrot.color();
        }
    }
}
