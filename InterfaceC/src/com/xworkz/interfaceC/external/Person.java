package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Candy;

public class Person {
    private Candy candy;

    public Person(Candy candy) {
        this.candy = candy;
        System.out.println("constr in Person");
    }

    public void enjoyCandy() {
        if (this.candy != null) {
            System.out.println("not null");
            this.candy.eat();
        } else {
            System.out.println("null");
        }
    }
}

