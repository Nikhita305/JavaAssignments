class Bottle {
    String brand;
    int capacity;
    String material;
    double price;

    Bottle() {
        System.out.println("Bottle created!");
    }

    public static void main(String[] args) {
        Bottle b1 = new Bottle();
        b1.brand = "Milton";
        b1.capacity = 1000;
        b1.material = "Steel";
        b1.price = 15.99;
        System.out.println(b1.brand + " " + b1.capacity + " " + b1.material + " " + b1.price);

        Bottle b2 = new Bottle();
        b2.brand = "Cello";
        b2.capacity = 750;
        b2.material = "Plastic";
        b2.price = 9.99;
        System.out.println(b2.brand + " " + b2.capacity + " " + b2.material + " " + b2.price);

        Bottle b3 = new Bottle();
        b3.brand = "Tupperware";
        b3.capacity = 1500;
        b3.material = "Glass";
        b3.price = 19.99;
        System.out.println(b3.brand + " " + b3.capacity + " " + b3.material + " " + b3.price);

        Bottle b4 = new Bottle();
        b4.brand = "Aquafina";
        b4.capacity = 500;
        b4.material = "Plastic";
        b4.price = 5.99;
        System.out.println(b4.brand + " " + b4.capacity + " " + b4.material + " " + b4.price);

        Bottle b5 = new Bottle();
        b5.brand = "Bisleri";
        b5.capacity = 1000;
        b5.material = "Plastic";
        b5.price = 7.99;
        System.out.println(b5.brand + " " + b5.capacity + " " + b5.material + " " + b5.price);

        Bottle b6 = new Bottle();
        b6.brand = "Nalgene";
        b6.capacity = 2000;
        b6.material = "Plastic";
        b6.price = 25.99;
        System.out.println(b6.brand + " " + b6.capacity + " " + b6.material + " " + b6.price);

        Bottle b7 = new Bottle();
        b7.brand = "Pigeon";
        b7.capacity = 600;
        b7.material = "Glass";
        b7.price = 11.99;
        System.out.println(b7.brand + " " + b7.capacity + " " + b7.material + " " + b7.price);

        Bottle b8 = new Bottle();
        b8.brand = "Fiji";
        b8.capacity = 750;
        b8.material = "Plastic";
        b8.price = 8.99;
        System.out.println(b8.brand + " " + b8.capacity + " " + b8.material + " " + b8.price);

        Bottle b9 = new Bottle();
        b9.brand = "Evian";
        b9.capacity = 1000;
        b9.material = "Plastic";
        b9.price = 12.99;
        System.out.println(b9.brand + " " + b9.capacity + " " + b9.material + " " + b9.price);

        Bottle b10 = new Bottle();
        b10.brand = "Hydro Flask";
        b10.capacity = 1800;
        b10.material = "Steel";
        b10.price = 34.99;
        System.out.println(b10.brand + " " + b10.capacity + " " + b10.material + " " + b10.price);
    }
}
