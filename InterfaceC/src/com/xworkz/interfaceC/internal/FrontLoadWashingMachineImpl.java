package com.xworkz.interfaceC.internal;

public class FrontLoadWashingMachineImpl implements WashingMachine {
    public FrontLoadWashingMachineImpl() {
        super();
        System.out.println("no-arg constr in FrontLoadWashingMachineImpl");
    }

    @Override
    public void wash() {
        System.out.println("Wash in FrontLoadWashingMachineImpl");
    }
}

