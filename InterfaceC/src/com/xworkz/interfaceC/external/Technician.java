package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Computer;

public class Technician {
    private Computer computer;

    public Technician(Computer computer) {
        this.computer = computer;
        System.out.println("constr in Technician");
    }

    public void powerUp() {
        if (this.computer != null) {
            System.out.println("not null");
            this.computer.boot();
        } else {
            System.out.println("null");
        }
    }
}
