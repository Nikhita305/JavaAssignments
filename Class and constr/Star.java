class Star {
    String name;
    double brightness;
    int distance;
    String color;

    Star() {
        System.out.println("Star object created!");
    }

    public static void main(String[] args) {
        Star s1 = new Star();
        s1.name = "Sirius";
        s1.brightness = 1.42;
        s1.distance = 8;
        s1.color = "Blue-White";
        System.out.println(s1.name + "  " + s1.brightness + "  " + s1.distance + " light-years  " + s1.color);

        Star s2 = new Star();
        s2.name = "Betelgeuse";
        s2.brightness = 0.42;
        s2.distance = 642;
        s2.color = "Red";
        System.out.println(s2.name + "  " + s2.brightness + "  " + s2.distance + " light-years  " + s2.color);

        Star s3 = new Star();
        s3.name = "Vega";
        s3.brightness = 0.03;
        s3.distance = 25;
        s3.color = "Blue-White";
        System.out.println(s3.name + "  " + s3.brightness + "  " + s3.distance + " light-years  " + s3.color);

        Star s4 = new Star();
        s4.name = "Antares";
        s4.brightness = 0.88;
        s4.distance = 550;
        s4.color = "Red";
        System.out.println(s4.name + "  " + s4.brightness + "  " + s4.distance + " light-years  " + s4.color);

        Star s5 = new Star();
        s5.name = "Rigel";
        s5.brightness = 0.12;
        s5.distance = 860;
        s5.color = "Blue";
        System.out.println(s5.name + "  " + s5.brightness + "  " + s5.distance + " light-years  " + s5.color);

        Star s6 = new Star();
        s6.name = "Proxima Centauri";
        s6.brightness = 11.05;
        s6.distance = 4;
        s6.color = "Red";
        System.out.println(s6.name + " - " + s6.brightness + " - " + s6.distance + " light-years - " + s6.color);

        Star s7 = new Star();
        s7.name = "Aldebaran";
        s7.brightness = 0.85;
        s7.distance = 65;
        s7.color = "Orange";
        System.out.println(s7.name + "  " + s7.brightness + "  " + s7.distance + " light-years  " + s7.color);

        Star s8 = new Star();
        s8.name = "Arcturus";
        s8.brightness = -0.05;
        s8.distance = 37;
        s8.color = "Orange";
        System.out.println(s8.name + "  " + s8.brightness + "  " + s8.distance + " light-years  " + s8.color);

        Star s9 = new Star();
        s9.name = "Capella";
        s9.brightness = 0.08;
        s9.distance = 42;
        s9.color = "Yellow";
        System.out.println(s9.name + "  " + s9.brightness + " - " + s9.distance + " light-years  " + s9.color);

        Star s10 = new Star();
        s10.name = "Spica";
        s10.brightness = 0.98;
        s10.distance = 250;
        s10.color = "Blue";
        System.out.println(s10.name + "  " + s10.brightness + "  " + s10.distance + " light-years " + s10.color);
    }
}
