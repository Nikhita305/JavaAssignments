package com.xworkz.abstractClasses;

public class AbstractRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
        System.out.println("***************");

        Circle circle = new Circle();
        circle.draw();
        System.out.println("***************");

        Car car = new Car();
        car.start();
        car.stop();
        System.out.println("***************");

        Dish dish1 = new Dish("Pizza", "Fast Food", 285);
        dish1.displayInfo();
        dish1.showPrice();
        System.out.println("***************");

        House house = new House("Villa", "Residential", 3, 250);
        house.displayArea();
    }
}
