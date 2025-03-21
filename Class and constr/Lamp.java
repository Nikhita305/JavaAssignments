class Lamp {
    String brand;
    int wattage;
    String type;
    double price;

    Lamp() {
        System.out.println("Lamp created!");
    }

    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        l1.brand = "Philips";
        l1.wattage = 9;
        l1.type = "LED";
        l1.price = 12.99;
        System.out.println(l1.brand + " " + l1.wattage + "W " + l1.type + " " + l1.price);

        Lamp l2 = new Lamp();
        l2.brand = "Syska";
        l2.wattage = 12;
        l2.type = "CFL";
        l2.price = 8.99;
        System.out.println(l2.brand + " " + l2.wattage + "W " + l2.type + " " + l2.price);

        Lamp l3 = new Lamp();
        l3.brand = "Havells";
        l3.wattage = 15;
        l3.type = "Halogen";
        l3.price = 14.99;
        System.out.println(l3.brand + " " + l3.wattage + "W " + l3.type + " " + l3.price);

        Lamp l4 = new Lamp();
        l4.brand = "Wipro";
        l4.wattage = 20;
        l4.type = "LED";
        l4.price = 18.99;
        System.out.println(l4.brand + " " + l4.wattage + "W " + l4.type + " " + l4.price);

        Lamp l5 = new Lamp();
        l5.brand = "Eveready";
        l5.wattage = 10;
        l5.type = "Fluorescent";
        l5.price = 9.99;
        System.out.println(l5.brand + " " + l5.wattage + "W " + l5.type + " " + l5.price);

        Lamp l6 = new Lamp();
        l6.brand = "Bajaj";
        l6.wattage = 7;
        l6.type = "Incandescent";
        l6.price = 5.99;
        System.out.println(l6.brand + " " + l6.wattage + "W " + l6.type + " " + l6.price);

        Lamp l7 = new Lamp();
        l7.brand = "Crompton";
        l7.wattage = 25;
        l7.type = "LED";
        l7.price = 22.99;
        System.out.println(l7.brand + " " + l7.wattage + "W " + l7.type + " " + l7.price);

        Lamp l8 = new Lamp();
        l8.brand = "Orient";
        l8.wattage = 5;
        l8.type = "CFL";
        l8.price = 6.99;
        System.out.println(l8.brand + " " + l8.wattage + "W " + l8.type + " " + l8.price);

        Lamp l9 = new Lamp();
        l9.brand = "Panasonic";
        l9.wattage = 18;
        l9.type = "LED";
        l9.price = 16.99;
        System.out.println(l9.brand + " " + l9.wattage + "W " + l9.type + " " + l9.price);

        Lamp l10 = new Lamp();
        l10.brand = "GE";
        l10.wattage = 11;
        l10.type = "Halogen";
        l10.price = 10.99;
        System.out.println(l10.brand + " " + l10.wattage + "W " + l10.type + " " + l10.price);
    }
}
