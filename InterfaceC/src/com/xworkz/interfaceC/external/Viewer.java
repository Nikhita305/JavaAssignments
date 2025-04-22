package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Screen;

public class Viewer {
    private Screen screen;

    public Viewer(Screen screen) {
        this.screen = screen;
        System.out.println("constr in Viewer");
    }

    public void watch() {
        if (this.screen != null) {
            System.out.println("not null");
            this.screen.display();
        } else {
            System.out.println("null");
        }
    }
}

