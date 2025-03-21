class Chocolate {
    String brand;
    String type;
    int weight;
    double price;

    Chocolate() {
        System.out.println("Chocolate created!");
    }

    public static void main(String[] args) {
        Chocolate c1 = new Chocolate();
        c1.brand = "Cadbury";
        c1.type = "Milk";
        c1.weight = 50;
        c1.price = 1.5;
        System.out.println(c1.brand + " " + c1.type + " " + c1.weight + " " + c1.price);

        Chocolate c2 = new Chocolate();
        c2.brand = "Lindt";
        c2.type = "Dark";
        c2.weight = 100;
        c2.price = 2.5;
        System.out.println(c2.brand + " " + c2.type + " " + c2.weight + " " + c2.price);

        Chocolate c3 = new Chocolate();
        c3.brand = "Hershey's";
        c3.type = "Milk";
        c3.weight = 45;
        c3.price = 1.2;
        System.out.println(c3.brand + " " + c3.type + " " + c3.weight + " " + c3.price);

        Chocolate c4 = new Chocolate();
        c4.brand = "Ferrero Rocher";
        c4.type = "Hazelnut";
        c4.weight = 75;
        c4.price = 3.0;
        System.out.println(c4.brand + " " + c4.type + " " + c4.weight + " " + c4.price);

        Chocolate c5 = new Chocolate();
        c5.brand = "Toblerone";
        c5.type = "Almond";
        c5.weight = 80;
        c5.price = 2.8;
        System.out.println(c5.brand + " " + c5.type + " " + c5.weight + " " + c5.price);

        Chocolate c6 = new Chocolate();
        c6.brand = "Nestle";
        c6.type = "White";
        c6.weight = 60;
        c6.price = 2.0;
        System.out.println(c6.brand + " " + c6.type + " " + c6.weight + " " + c6.price);

        Chocolate c7 = new Chocolate();
        c7.brand = "Galaxy";
        c7.type = "Caramel";
        c7.weight = 55;
        c7.price = 1.7;
        System.out.println(c7.brand + " " + c7.type + " " + c7.weight + " " + c7.price);

        Chocolate c8 = new Chocolate();
        c8.brand = "Dairy Milk Silk";
        c8.type = "Fruit & Nut";
        c8.weight = 70;
        c8.price = 2.2;
        System.out.println(c8.brand + " " + c8.type + " " + c8.weight + " " + c8.price);

        Chocolate c9 = new Chocolate();
        c9.brand = "Milka";
        c9.type = "Creamy";
        c9.weight = 90;
        c9.price = 2.9;
        System.out.println(c9.brand + " " + c9.type + " " + c9.weight + " " + c9.price);

        Chocolate c10 = new Chocolate();
        c10.brand = "Bournville";
        c10.type = "Bitter Dark";
        c10.weight = 100;
        c10.price = 3.5;
        System.out.println(c10.brand + " " + c10.type + " " + c10.weight + " " + c10.price);
    }
}
