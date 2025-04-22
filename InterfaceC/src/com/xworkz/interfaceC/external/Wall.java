package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Frame;

public class Wall {
    private Frame frame;

    public Wall(Frame frame) {
        this.frame = frame;
        System.out.println("constr in Wall");
    }

    public void hangFrame() {
        if (this.frame != null) {
            System.out.println("not null");
            this.frame.display();
        } else {
            System.out.println("null");
        }
    }
}

