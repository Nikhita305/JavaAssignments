package com.xworkz.inheritanceTypes.heirarchical;

public class Pine extends Wood {
    private boolean isEvergreen;

    public Pine(String type, double weight, boolean isEvergreen) {
        super(type, weight);
        this.isEvergreen = isEvergreen;
    }

    public boolean isEvergreen() {
        return isEvergreen;
    }
}

