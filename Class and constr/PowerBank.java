class PowerBank {
    String brand;
    int capacity;
    int outputPorts;
    double price;

    PowerBank() {
        System.out.println("PowerBank created!");
    }

    public static void main(String[] args) {
        PowerBank p1 = new PowerBank();
        p1.brand = "Anker";
        p1.capacity = 10000;
        p1.outputPorts = 2;
        p1.price = 29.99;
        System.out.println(p1.brand + " " + p1.capacity + " " + p1.outputPorts + "  " + p1.price);

        PowerBank p2 = new PowerBank();
        p2.brand = "Xiaomi";
        p2.capacity = 20000;
        p2.outputPorts = 3;
        p2.price = 34.99;
        System.out.println(p2.brand + " " + p2.capacity + " " + p2.outputPorts + "  " + p2.price);

        PowerBank p3 = new PowerBank();
        p3.brand = "Realme";
        p3.capacity = 15000;
        p3.outputPorts = 2;
        p3.price = 24.99;
        System.out.println(p3.brand + " " + p3.capacity + " " + p3.outputPorts + "  " + p3.price);

        PowerBank p4 = new PowerBank();
        p4.brand = "Samsung";
        p4.capacity = 25000;
        p4.outputPorts = 3;
        p4.price = 49.99;
        System.out.println(p4.brand + " " + p4.capacity + " " + p4.outputPorts + "  " + p4.price);

        PowerBank p5 = new PowerBank();
        p5.brand = "Sony";
        p5.capacity = 30000;
        p5.outputPorts = 4;
        p5.price = 59.99;
        System.out.println(p5.brand + " " + p5.capacity + " " + p5.outputPorts + "  " + p5.price);

        PowerBank p6 = new PowerBank();
        p6.brand = "OnePlus";
        p6.capacity = 18000;
        p6.outputPorts = 2;
        p6.price = 39.99;
        System.out.println(p6.brand + " " + p6.capacity + " " + p6.outputPorts + "  " + p6.price);

        PowerBank p7 = new PowerBank();
        p7.brand = "Mi";
        p7.capacity = 22000;
        p7.outputPorts = 3;
        p7.price = 44.99;
        System.out.println(p7.brand + " " + p7.capacity + " " + p7.outputPorts + "  " + p7.price);

        PowerBank p8 = new PowerBank();
        p8.brand = "Asus";
        p8.capacity = 12000;
        p8.outputPorts = 2;
        p8.price = 27.99;
        System.out.println(p8.brand + " " + p8.capacity + " " + p8.outputPorts + " " + p8.price);

        PowerBank p9 = new PowerBank();
        p9.brand = "Ubon";
        p9.capacity = 17000;
        p9.outputPorts = 2;
        p9.price = 35.99;
        System.out.println(p9.brand + " " + p9.capacity + " " + p9.outputPorts + " " + p9.price);

        PowerBank p10 = new PowerBank();
        p10.brand = "Syska";
        p10.capacity = 14000;
        p10.outputPorts = 2;
        p10.price = 31.99;
        System.out.println(p10.brand + " " + p10.capacity + " " + p10.outputPorts + " " + p10.price);
    }
}
