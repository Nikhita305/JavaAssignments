package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Mall;

public class Customer {
    private Mall mall;

    public Customer(Mall mall) {
        this.mall = mall;
        System.out.println("constr in Customer");
    }

    public void shop() {
        if (this.mall != null) {
            System.out.println("not null");
            this.mall.openStore();
        } else {
            System.out.println("null");
        }
    }
}

