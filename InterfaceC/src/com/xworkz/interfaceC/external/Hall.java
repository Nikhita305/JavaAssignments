package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.AirConditioner;

public class Hall {
    private AirConditioner ac;

    public Hall(AirConditioner ac) {
        this.ac = ac;
        System.out.println("constr in Room");
    }

    public void startCooling() {
        if (this.ac != null) {
            System.out.println("not null");
            this.ac.cool();
        } else {
            System.out.println("null");
        }
    }
}

