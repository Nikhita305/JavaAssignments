package com.xworkz.inheritanceTypes.heirarchical;

public class Fruit extends Food {
    private boolean isCitrus;

    public Fruit(String name, int calories, boolean isCitrus) {
        super(name, calories);
        this.isCitrus = isCitrus;
    }

    public boolean isCitrus() {
        return isCitrus;
    }
}
