package com.xworkz.interfaceClass.internal;

public interface Plant {
    void grow();
    void photosynthesize();
    void flower();

    default void shedLeaves() {
        System.out.println("The plant is shedding its leaves");
    }
}
