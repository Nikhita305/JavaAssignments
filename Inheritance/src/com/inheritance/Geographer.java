package com.inheritance;

public class Geographer {
    public void study(Mountain mountain) {
        mountain.name();
        mountain.height();
        mountain.location();
        mountain.climate();
        mountain.importance();

        if (mountain instanceof Himalaya) {
            Himalaya himalaya = (Himalaya) mountain;
            himalaya.peaks();
        }
    }
}
