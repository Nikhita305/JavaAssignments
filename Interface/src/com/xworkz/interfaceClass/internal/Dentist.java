package com.xworkz.interfaceClass.internal;
public interface Dentist {
    void cleanTeeth();
    void fillCavity();
    void removeTooth();

    default void add(){
        System.out.println("Add in Dentist");
    }
}
