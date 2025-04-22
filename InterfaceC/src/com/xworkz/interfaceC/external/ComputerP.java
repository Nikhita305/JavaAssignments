package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Printer;

public class ComputerP {
    private Printer printer;

    public ComputerP(Printer printer) {
        this.printer = printer;
        System.out.println("constr in Computer");
    }

    public void startPrinting() {
        if (this.printer != null) {
            System.out.println("not null");
            this.printer.print();
        } else {
            System.out.println("null");
        }
    }
}

