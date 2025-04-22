package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.TV;

public class Remote {
    private TV tv;

    public Remote(TV tv) {
        this.tv = tv;
        System.out.println("constr in Remote");
    }

    public void pressPowerButton() {
        if (this.tv != null) {
            System.out.println("not null");
            this.tv.play();
        } else {
            System.out.println("null");
        }
    }
}

