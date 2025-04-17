package com.xworkz.interfaceClass.internal;

public interface Glass {
    void clean();
    void fill();
    void breakGlass();

    default void recycle() {
        System.out.println("Recycling the glass after use");
    }
}
