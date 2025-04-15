package com.xworkz.inheritanceTypes.multiLevel;

public class MultiLevelRunner {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Labrador");
        System.out.println("Name: " + dog.getName() + ", Age: " + dog.getAge() + ", Breed: " + dog.getBreed());

        SportsCar sportsCar = new SportsCar("Ferrari", "488", 210);
        System.out.println("Brand: " + sportsCar.getBrand() + ", Model: " + sportsCar.getModel() + ", Top Speed: " + sportsCar.getTopSpeed());

        Triangle triangle = new Triangle("Red", 3, 25.5);
        System.out.println("Color: " + triangle.getColor() + ", Sides: " + triangle.getSides() + ", Area: " + triangle.getArea());

        Manager manager = new Manager("John Doe", 101, 5);
        System.out.println("Name: " + manager.getName() + ", Employee ID: " + manager.getEmployeeId() + ", Team Size: " + manager.getTeamSize());

        InterestAccount account = new InterestAccount(12345, 1500.75, 5.5);
        System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance() + ", Interest Rate: " + account.getInterestRate());

        SmartWashingMachine smartWashingMachine = new SmartWashingMachine("Samsung", 7, true);
        System.out.println("Brand: " + smartWashingMachine.getBrand() + ", Capacity: " + smartWashingMachine.getCapacity() + ", Wifi Enabled: " + smartWashingMachine.isWifiEnabled());

        AudioBook audioBook = new AudioBook("The Great Gatsby", 2.5, 10.5);
        System.out.println("Title: " + audioBook.getTitle() + ", File Size: " + audioBook.getFileSize() + "MB, Duration: " + audioBook.getDuration() + " hours");

        CheesePizza cheesePizza = new CheesePizza("Margherita", "Large", true);
        System.out.println("Pizza: " + cheesePizza.getName() + ", Size: " + cheesePizza.getSize() + ", Extra Cheese: " + cheesePizza.hasExtraCheese());

        Earth earth = new Earth("Earth", true, true);
        System.out.println("Planet: " + earth.getName() + ", Atmosphere: " + earth.hasAtmosphere() + ", Supports Life: " + earth.supportsLife());

        GreenMartian greenMartian = new GreenMartian("Martian", "Mars", 100);
        System.out.println("Species: " + greenMartian.getSpecies() + ", Planet: " + greenMartian.getPlanet() + ", Strength: " + greenMartian.getStrength());

        StormySky stormySky = new StormySky("Gray", 80, true);
        System.out.println("Sky Color: " + stormySky.getColor() + ", Cloud Density: " + stormySky.getCloudDensity() + "%, Thunderstorm: " + stormySky.isThunderstorm());
    }

}

