package com.xworkz.interfaceClass.external;

import com.xworkz.interfaceClass.internal.Bird;

public class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("The sparrow is flying high in the sky");
    }

    @Override
    public void sing() {
        System.out.println("The sparrow is singing a cheerful song");
    }

    @Override
    public void buildNest() {
        System.out.println("The sparrow is building a nest in the tree");
    }

    @Override
    public void migrate() {
        System.out.println("The sparrow is migrating to warmer regions for the winter");
    }
}
