class Flag {
    String country;
    String color;
    int width;
    int height;

    Flag() {
        System.out.println("Flag created!");
    }

    public static void main(String[] args) {
        Flag f1 = new Flag();
        f1.country = "USA";
        f1.color = "Red, White, Blue";
        f1.width = 50;
        f1.height = 30;
        System.out.println(f1.country + " " + f1.color + " " + f1.width + " " + f1.height);

        Flag f2 = new Flag();
        f2.country = "India";
        f2.color = "Saffron, White, Green";
        f2.width = 60;
        f2.height = 40;
        System.out.println(f2.country + " " + f2.color + " " + f2.width + " " + f2.height);

        Flag f3 = new Flag();
        f3.country = "Canada";
        f3.color = "Red, White";
        f3.width = 45;
        f3.height = 30;
        System.out.println(f3.country + " " + f3.color + " " + f3.width + " " + f3.height);

        Flag f4 = new Flag();
        f4.country = "Germany";
        f4.color = "Black, Red, Yellow";
        f4.width = 55;
        f4.height = 35;
        System.out.println(f4.country + " " + f4.color + " " + f4.width + " " + f4.height);

        Flag f5 = new Flag();
        f5.country = "Brazil";
        f5.color = "Green, Yellow, Blue";
        f5.width = 70;
        f5.height = 50;
        System.out.println(f5.country + " " + f5.color + " " + f5.width + " " + f5.height);

        Flag f6 = new Flag();
        f6.country = "Japan";
        f6.color = "White, Red";
        f6.width = 48;
        f6.height = 32;
        System.out.println(f6.country + " " + f6.color + " " + f6.width + " " + f6.height);

        Flag f7 = new Flag();
        f7.country = "France";
        f7.color = "Blue, White, Red";
        f7.width = 50;
        f7.height = 33;
        System.out.println(f7.country + " " + f7.color + " " + f7.width + " " + f7.height);

        Flag f8 = new Flag();
        f8.country = "Italy";
        f8.color = "Green, White, Red";
        f8.width = 52;
        f8.height = 34;
        System.out.println(f8.country + " " + f8.color + " " + f8.width + " " + f8.height);

        Flag f9 = new Flag();
        f9.country = "UK";
        f9.color = "Red, White, Blue";
        f9.width = 58;
        f9.height = 36;
        System.out.println(f9.country + " " + f9.color + " " + f9.width + " " + f9.height);

        Flag f10 = new Flag();
        f10.country = "Russia";
        f10.color = "White, Blue, Red";
        f10.width = 65;
        f10.height = 42;
        System.out.println(f10.country + " " + f10.color + " " + f10.width + " " + f10.height);
    }
}
