package com.inheritance;

public class Technician {
    public void inspect(Device device) {
        device.start();
        device.performTask();
        device.charge();
        device.update();
        device.shutDown();

        if (device instanceof Laptop) {
            Laptop laptop = (Laptop) device;
            laptop.connectToWiFi();
        }
    }
}
