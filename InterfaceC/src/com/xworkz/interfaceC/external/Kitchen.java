package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Microwave;

public class Kitchen {
    private Microwave microwave;

    public Kitchen(Microwave microwave) {
        this.microwave = microwave;
        System.out.println("constr in Kitchen");
    }

    public void startCooking() {
        if (this.microwave != null) {
            System.out.println("not null");
            this.microwave.cook();
        } else {
            System.out.println("null");
        }
    }
}

