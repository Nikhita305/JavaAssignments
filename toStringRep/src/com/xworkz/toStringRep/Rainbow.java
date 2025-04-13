package com.xworkz.toStringRep;

public class Rainbow {
    private int colors;
    private String shape;
    private String timeVisible;

    public Rainbow(int colors, String shape, String timeVisible) {
        this.colors = colors;
        this.shape = shape;
        this.timeVisible = timeVisible;
        System.out.println("Rainbow Constructor");
    }

    @Override
    public String toString() {
        return "Colors: " + this.colors + ", Shape: " + this.shape + ", Visible At: " + this.timeVisible;
    }

    @Override
    public int hashCode() {
        return 95;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Rainbow) {
                System.out.println("Ref is Rainbow, compare");
                Rainbow Rainbow = this;
                Rainbow rainbow1 = (Rainbow) obj;
                if (Rainbow.colors == rainbow1.colors
                        && Rainbow.shape.equals(rainbow1.shape)
                        && Rainbow.timeVisible.equals(rainbow1.timeVisible)) {
                    System.out.println("Both Rainbow objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
