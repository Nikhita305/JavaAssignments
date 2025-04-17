package com.xworkz.interfaceClass.internal;

public interface AI {
    void learn();
    void predict();
    void optimize();

    default void delete(){
        System.out.println("Ruuning Delete in AI");
    }
}
