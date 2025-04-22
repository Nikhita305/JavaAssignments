package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Sky;

public class WeatherReporter {
    private Sky sky;

    public WeatherReporter(Sky sky) {
        this.sky = sky;
        System.out.println("constr in WeatherReporter");
    }

    public void reportWeather() {
        if (this.sky != null) {
            System.out.println("not null");
            this.sky.displayWeather();
        } else {
            System.out.println("null");
        }
    }
}

