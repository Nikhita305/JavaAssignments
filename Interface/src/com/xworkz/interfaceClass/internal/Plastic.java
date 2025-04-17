package com.xworkz.interfaceClass.internal;

public interface Plastic {
    void mold();
    void recycle();
    void dispose();

    default void reduce() {
        System.out.println("Reducing the use of plastic to minimize waste");
    }
}
