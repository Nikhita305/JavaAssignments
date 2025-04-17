package com.xworkz.interfaceClass.internal;

public interface Zoo {
    void displayAnimals();
    void organizeTours();
    void conserveSpecies();

    default void activities() {
        System.out.println("Running zoo activities in Zoo");
    }
}
