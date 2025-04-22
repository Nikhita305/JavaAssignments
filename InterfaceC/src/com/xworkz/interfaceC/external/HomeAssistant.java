package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.SmartHomeDevice;

public class HomeAssistant {
    private SmartHomeDevice device;

    public HomeAssistant(SmartHomeDevice device) {
        this.device = device;
        System.out.println("constr in HomeAssistant");
    }

    public void controlDevice() {
        if (this.device != null) {
            System.out.println("not null");
            this.device.activate();
        } else {
            System.out.println("null");
        }
    }
}
