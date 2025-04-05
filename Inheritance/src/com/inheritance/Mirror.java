package com.inheritance;

public class Mirror extends Glass {
    public Mirror() {
        System.out.println("🪞 Mirror constructor called");
    }

    @Override
    public void material() {
        System.out.println("Glass with a reflective metallic coating.");
    }

    @Override
    public void transparency() {
        System.out.println("Not transparent, reflects images.");
    }

    @Override
    public void fragility() {
        System.out.println("Still fragile but often backed for safety.");
    }

    @Override
    public void usage() {
        System.out.println("Used in homes, vehicles, makeup kits.");
    }

    @Override
    public void recycling() {
        System.out.println("Harder to recycle than regular glass due to coating.");
    }
}
