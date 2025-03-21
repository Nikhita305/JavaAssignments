class Bag {
    String brand;
    String color;
    int capacity;
    double price;

    Bag() {
        System.out.println("Bag object created!");
    }

    public static void main(String[] args) {
        Bag b1 = new Bag();
        b1.brand = "Puma";
        b1.color = "Purple";
        b1.capacity = 30;
        b1.price = 2500.50;
        System.out.println(b1.brand + " " + b1.color + " " + b1.capacity + " " + b1.price);

        Bag b2 = new Bag();
        b2.brand = "Adidas";
        b2.color = "Blue";
        b2.capacity = 25;
        b2.price = 2200.75;
        System.out.println(b2.brand + " " + b2.color + "   " + b2.capacity + " " + b2.price);

        Bag b3 = new Bag();
        b3.brand = "Wildcraft";
        b3.color = "Red";
        b3.capacity = 35;
        b3.price = 2999.00;
        System.out.println(b3.brand + " " + b3.color + "   " + b3.capacity + " " + b3.price);

        Bag b4 = new Bag();
        b4.brand = "American Tourister";
        b4.color = "Grey";
        b4.capacity = 40;
        b4.price = 3500.99;
        System.out.println(b4.brand + " " + b4.color + "   " + b4.capacity + " " + b4.price);

        Bag b5 = new Bag();
        b5.brand = "Skybags";
        b5.color = "Green";
        b5.capacity = 28;
        b5.price = 2000.25;
        System.out.println(b5.brand + " " + b5.color + "   " + b5.capacity + " " + b5.price);

        Bag b6 = new Bag();
        b6.brand = "Nike";
        b6.color = "Yellow";
        b6.capacity = 32;
        b6.price = 2700.89;
        System.out.println(b6.brand + " " + b6.color + "   " + b6.capacity + " " + b6.price);

        Bag b7 = new Bag();
        b7.brand = "Reebok";
        b7.color = "Brown";
        b7.capacity = 34;
        b7.price = 2800.45;
        System.out.println(b7.brand + " " + b7.color + "   " + b7.capacity + " " + b7.price);

        Bag b8 = new Bag();
        b8.brand = "Decathlon";
        b8.color = "Orange";
        b8.capacity = 29;
        b8.price = 2300.30;
        System.out.println(b8.brand + " " + b8.color + "   " + b8.capacity + " " + b8.price);

        Bag b9 = new Bag();
        b9.brand = "Fastrack";
        b9.color = "Purple";
        b9.capacity = 38;
        b9.price = 3100.60;
        System.out.println(b9.brand + " " + b9.color + "   " + b9.capacity + " " + b9.price);

        Bag b10 = new Bag();
        b10.brand = "VIP";
        b10.color = "White";
        b10.capacity = 50;
        b10.price = 4000.99;
        System.out.println(b10.brand + " " + b10.color + "   " + b10.capacity + " " + b10.price);
    }
}
