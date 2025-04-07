package com.inheritance;

public class Doremon extends Cartoon {

    public Doremon() {
        System.out.println("Running no-arg constructor of Doremon");
    }

    @Override
    public void display() {
        System.out.println("Running display in Doremon");
    }

    @Override
    public void entertain() {
        System.out.println("Running entertain in Doremon");
    }

    @Override
    public void speak() {
        System.out.println("Running speak in Doremon");
    }

    @Override
    public void run() {
        System.out.println("Running run in Doremon");
    }

    public void jump(){
        System.out.println("Running jump in Doremon");
    }
}
