package com.xworkz.interfaceC.internal;

public class SiriImpl implements VirtualAssistant {
    public SiriImpl() {
        super();
        System.out.println("no-arg constr in SiriImpl");
    }

    @Override
    public void respondToCommand() {
        System.out.println("Siri responding to command: ");
    }
}

