package com.xworkz.interfaceC.internal;

public class BluetoothSpeakerImpl implements Speaker {
    public BluetoothSpeakerImpl() {
        super();
        System.out.println("no-arg constr in BluetoothSpeakerImpl");
    }

    @Override
    public void playSound() {
        System.out.println("Play sound in BluetoothSpeakerImpl");
    }
}

