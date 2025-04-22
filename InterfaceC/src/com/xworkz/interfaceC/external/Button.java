package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Light;

public class Button {
    private Light light;

    public Button(Light light) {
        this.light = light;
        System.out.println("constr in Button");
    }

    public void press() {
        if (this.light != null) {
            System.out.println("not null");
            this.light.glow();
        } else {
            System.out.println("null");
        }
    }
}

