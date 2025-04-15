package com.xworkz.inheritanceTypes.heirarchical;

public class Vegetable extends Food {
    private boolean isLeafy;

    public Vegetable(String name, int calories, boolean isLeafy) {
        super(name, calories);
        this.isLeafy = isLeafy;
    }

    public boolean isLeafy() {
        return isLeafy;
    }
}

