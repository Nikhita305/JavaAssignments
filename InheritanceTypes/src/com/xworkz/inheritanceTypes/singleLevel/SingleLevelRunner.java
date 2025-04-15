package com.xworkz.inheritanceTypes.singleLevel;

public class SingleLevelRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Car car = new Car();
        car.type();

        Circle circle = new Circle();
        circle.draw();

        Student student = new Student();
        student.display();

        WashingMachine wm = new WashingMachine();
        wm.powerOn();

        Mango mango = new Mango();
        mango.color();

        Laptop laptop = new Laptop();
        laptop.perform();

        Eagle eagle = new Eagle();
        eagle.fly();

        Sun sun = new Sun();
        sun.displayType();
        sun.displayTemperature();

        Rain rain = new Rain();
        rain.showCondition();
        rain.showRain();

        DarkChocolate dc = new DarkChocolate();
        dc.showFlavor();
        dc.price();
    }
}
