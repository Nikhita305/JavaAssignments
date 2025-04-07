package com.inheritance;

public class Creator {
    public void apply(Color color) {
        color.name();
        color.wavelength();
        color.emotion();
        color.usedIn();
        color.combination();

        if (color instanceof Purple) {
            Purple purple = (Purple) color;
            purple.shadeType();
        }
    }
}
