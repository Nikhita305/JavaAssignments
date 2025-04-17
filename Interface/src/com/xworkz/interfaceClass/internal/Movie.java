package com.xworkz.interfaceClass.internal;

public interface Movie {
    void play();
    void pause();
    void stop();

    default void rewind() {
        System.out.println("Rewinding the movie to the beginning");
    }
}
