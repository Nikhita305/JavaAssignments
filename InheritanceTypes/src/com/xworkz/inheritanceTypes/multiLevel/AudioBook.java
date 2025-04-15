package com.xworkz.inheritanceTypes.multiLevel;

public class AudioBook extends EBook {
    private double duration;

    public AudioBook(String title, double fileSize, double duration) {
        super(title, fileSize);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }
}
