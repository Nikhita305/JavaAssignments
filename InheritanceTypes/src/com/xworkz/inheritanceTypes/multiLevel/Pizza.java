package com.xworkz.inheritanceTypes.multiLevel;

public class Pizza extends Food {
    private String size;

    public Pizza(String name, String size) {
        super(name);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
