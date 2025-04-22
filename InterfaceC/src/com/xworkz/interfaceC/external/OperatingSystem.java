package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Laptop;

public class OperatingSystem {
    private Laptop laptop;

    public OperatingSystem(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Constructor in OperatingSystem");
    }

    public void startProcessing() {
        if (laptop != null) {
            System.out.println("Laptop reference is not null");
            laptop.process();
        } else {
            System.out.println("Laptop reference is null");
        }
    }
}
