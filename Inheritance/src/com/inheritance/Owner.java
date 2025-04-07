package com.inheritance;

public class Owner {
    public void care(Pet pet) {
        pet.name();
        pet.sound();
        pet.food();
        pet.activity();
        pet.sleep();

        if (pet instanceof Cat) {
            Cat cat = (Cat) pet;
            cat.purr();
        }
    }
}
