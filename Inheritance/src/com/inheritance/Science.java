package com.inheritance;

public class Science extends Subject {
    public Science() {
        System.out.println("Running no-arg constructor of Science");
    }

    @Override
    public void name() {
        System.out.println("This subject is Science");
    }

    @Override
    public void difficultyLevel() {
        System.out.println("Science can be easy or complex depending on the topic");
    }

    @Override
    public void topics() {
        System.out.println("Science includes Physics, Chemistry, Biology, etc.");
    }

    @Override
    public void importance() {
        System.out.println("Science is essential for understanding the world and innovations");
    }

    @Override
    public void field() {
        System.out.println("Science belongs to the STEM field");
    }
}
