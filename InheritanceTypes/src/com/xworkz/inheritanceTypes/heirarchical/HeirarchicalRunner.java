package com.xworkz.inheritanceTypes.heirarchical;

public class HeirarchicalRunner {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        Cat cat = new Cat("Whiskers", "White");
        System.out.println("Dog's Name: " + dog.getName() + ", Breed: " + dog.getBreed());
        System.out.println("Cat's Name: " + cat.getName() + ", Color: " + cat.getColor());

        Car car = new Car("Toyota", 120, 4);
        Bike bike = new Bike("Trek", 30, true);
        System.out.println("Car Brand: " + car.getBrand() + ", Speed: " + car.getSpeed() + "Doors: " + car.getDoors());
        System.out.println("Bike Brand: " + bike.getBrand() + ", Speed: " + bike.getSpeed() + "Has Pedals: " + bike.hasPedals());

        Eagle eagle = new Eagle("Golden Eagle", 2.3, true);
        Sparrow sparrow = new Sparrow("House Sparrow", 0.25, true);
        System.out.println("Eagle Name: " + eagle.getName() + ", Wingspan: " + eagle.getWingspan() + " meters, Can Hunt: " + eagle.canHunt());
        System.out.println("Sparrow Name: " + sparrow.getName() + ", Wingspan: " + sparrow.getWingspan() + " meters, Can Sing: " + sparrow.canSing());

        Fruit apple = new Fruit("Apple", 95, false);
        Vegetable spinach = new Vegetable("Spinach", 23, true);
        System.out.println("Fruit Name: " + apple.getName() + ", Calories: " + apple.getCalories() + ", Is Citrus: " + apple.isCitrus());
        System.out.println("Vegetable Name: " + spinach.getName() + ", Calories: " + spinach.getCalories() + ", Is Leafy: " + spinach.isLeafy());

        Employee emp = new Employee("John Doe", 30, "Software Engineer");
        Student stu = new Student("Alice Smith", 20, "Computer Science");
        System.out.println("Employee Name: " + emp.getName() + ", Age: " + emp.getAge() + ", Job Title: " + emp.getJobTitle());
        System.out.println("Student Name: " + stu.getName() + ", Age: " + stu.getAge() + ", Major: " + stu.getMajor());

        Oak oakWood = new Oak("Oak", 50.5, 120);
        Pine pineWood = new Pine("Pine", 30.0, true);
        System.out.println("Oak Type: " + oakWood.getType() + ", Weight: " + oakWood.getWeight() + " kg, Age: " + oakWood.getAge() + " years");
        System.out.println("Pine Type: " + pineWood.getType() + ", Weight: " + pineWood.getWeight() + " kg, Evergreen: " + pineWood.isEvergreen());

        Shark shark = new Shark("Great White Shark", 15, true);
        Goldfish goldfish = new Goldfish("Goldfish", 3, "Golden");
        System.out.println("Shark Species: " + shark.getSpecies() + ", Age: " + shark.getAge() + ", Is Dangerous: " + shark.isDangerous());
        System.out.println("Goldfish Species: " + goldfish.getSpecies() + ", Age: " + goldfish.getAge() + ", Color: " + goldfish.getColor());

        Superhero hero = new Superhero("Superman", 1938, "Strength");
        Villain villain = new Villain("Joker", 1940, "Create");
        System.out.println("Superhero Name: " + hero.getName() + ", Release Year: " + hero.getReleaseYear() + ", Superpower: " + hero.getSuperpower());
        System.out.println("Villain Name: " + villain.getName() + ", Release Year: " + villain.getReleaseYear() + ", Evil Plan: " + villain.getEvilPlan());

        PopSong popSong = new PopSong("Blinding Lights", "The Weeknd", "Hip-hop dance");
        RockSong rockSong = new RockSong("Bohemian Rhapsody", "Queen", "Electric guitar");
        System.out.println("Pop Song Title: " + popSong.getTitle() + ", Artist: " + popSong.getArtist() + ", Dance Style: " + popSong.getDanceStyle());
        System.out.println("Rock Song Title: " + rockSong.getTitle() + ", Artist: " + rockSong.getArtist() + ", Guitar Type: " + rockSong.getGuitarType());

        ActionMovie actionMovie = new ActionMovie("Max: Sid", "Gian", "Norr");
        ComedyMovie comedyMovie = new ComedyMovie("The Hangover", "Todd", "Gian");
        System.out.println("Action Movie Title: " + actionMovie.getTitle() + ", Director: " + actionMovie.getDirector() + ", Stunt: " + actionMovie.getStuntCoordinator());
        System.out.println("Comedy Movie Title: " + comedyMovie.getTitle() + ", Director: " + comedyMovie.getDirector() + ", Lead: " + comedyMovie.getLeadComedian());

        BrickWall brickWall = new BrickWall("Brick", 10.5, "Red Brick");
        StoneWall stoneWall = new StoneWall("Stone", 12.0, "Granite");
        System.out.println("Brick Wall Material: " + brickWall.getMaterial() + ", Height: " + brickWall.getHeight() + " meters, Brick Type: " + brickWall.getBrickType());
        System.out.println("Stone Wall Material: " + stoneWall.getMaterial() + ", Height: " + stoneWall.getHeight() + " meters, Stone Type: " + stoneWall.getStoneType());
    }
}
