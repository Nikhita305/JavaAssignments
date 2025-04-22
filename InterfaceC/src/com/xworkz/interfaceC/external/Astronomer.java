package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Earth;

public class Astronomer {
    private Earth earth;

    public Astronomer(Earth earth) {
        this.earth = earth;
        System.out.println("constr in Astronomer");
    }

    public void observeRotation() {
        if (this.earth != null) {
            System.out.println("not null");
            this.earth.rotate();
        } else {
            System.out.println("null");
        }
    }
}

