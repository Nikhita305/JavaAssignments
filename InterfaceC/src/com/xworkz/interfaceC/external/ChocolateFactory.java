package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Chocolate;

public class ChocolateFactory {
    private Chocolate chocolate;

    public ChocolateFactory(Chocolate chocolate) {
        this.chocolate = chocolate;
        System.out.println("Constructor in ChocolateFactory");
    }

    public void makeChocolate() {
        if (chocolate != null) {
            System.out.println("Chocolate reference is not null");
            chocolate.taste();
        } else {
            System.out.println("Chocolate reference is null");
        }
    }
}
