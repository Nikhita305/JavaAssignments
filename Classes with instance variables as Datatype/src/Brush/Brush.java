package Brush;

public class Brush {
    Color color;

    Brush(Color color) {
        this.color = color;
        System.out.println("Color: " + color);
    }

    void clean() {
        System.out.println("Cleaning the brush");
    }

    void scrub() {
        System.out.println("Scrubbing with the brush");
    }
}
