package com.JavareferenceandVariable;

public class Security {
    String type;
    int personnelCount;
    String level;
    boolean armed;
    Personnel personnel = new Personnel("guards", 123, "night shift", true);

    public Security(String type, int personnelCount, String level, boolean armed) {
        System.out.println("Creating Security object");
        this.type = type;
        this.personnelCount = personnelCount;
        this.level = level;
        this.armed = armed;
    }

    void display() {
        System.out.println("Security Details:");
        System.out.println("Type: " + this.type + ", Personnel Count: " + this.personnelCount + ", Level: " + this.level + ", Armed: " + this.armed);
        if (personnel != null) {
            personnel.display();
        }
    }
}
