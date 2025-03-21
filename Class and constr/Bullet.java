class Bullet {
    String caliber;
    int weight;
    int velocity;
    String type;

    Bullet() {
        System.out.println("Bullet created!");
    }

    public static void main(String[] args) {
        Bullet b1 = new Bullet();
        b1.caliber = "9mm";
        b1.weight = 124;
        b1.velocity = 1200;
        b1.type = "FMJ";
        System.out.println(b1.caliber + " " + b1.weight + " " + b1.velocity + " " + b1.type);

        Bullet b2 = new Bullet();
        b2.caliber = ".45ACP";
        b2.weight = 230;
        b2.velocity = 900;
        b2.type = "Hollow Point";
        System.out.println(b2.caliber + " " + b2.weight + " " + b2.velocity + " " + b2.type);

        Bullet b3 = new Bullet();
        b3.caliber = "5.56mm";
        b3.weight = 62;
        b3.velocity = 3100;
        b3.type = "FMJ";
        System.out.println(b3.caliber + " " + b3.weight + " " + b3.velocity + " " + b3.type);

        Bullet b4 = new Bullet();
        b4.caliber = "7.62mm";
        b4.weight = 147;
        b4.velocity = 2800;
        b4.type = "FMJ";
        System.out.println(b4.caliber + " " + b4.weight + " " + b4.velocity + " " + b4.type);

        Bullet b5 = new Bullet();
        b5.caliber = ".50 BMG";
        b5.weight = 660;
        b5.velocity = 2900;
        b5.type = "Armor Piercing";
        System.out.println(b5.caliber + " " + b5.weight + " " + b5.velocity + " " + b5.type);

        Bullet b6 = new Bullet();
        b6.caliber = ".22LR";
        b6.weight = 40;
        b6.velocity = 1250;
        b6.type = "Lead Round Nose";
        System.out.println(b6.caliber + " " + b6.weight + " " + b6.velocity + " " + b6.type);

        Bullet b7 = new Bullet();
        b7.caliber = ".357 Magnum";
        b7.weight = 158;
        b7.velocity = 1350;
        b7.type = "Jacketed Soft Point";
        System.out.println(b7.caliber + " " + b7.weight + " " + b7.velocity + " " + b7.type);

        Bullet b8 = new Bullet();
        b8.caliber = ".300 Winchester Magnum";
        b8.weight = 180;
        b8.velocity = 2960;
        b8.type = "Soft Point";
        System.out.println(b8.caliber + " " + b8.weight + " " + b8.velocity + " " + b8.type);

        Bullet b9 = new Bullet();
        b9.caliber = ".338 Lapua Magnum";
        b9.weight = 250;
        b9.velocity = 3000;
        b9.type = "Sniper Round";
        System.out.println(b9.caliber + " " + b9.weight + " " + b9.velocity + " " + b9.type);

        Bullet b10 = new Bullet();
        b10.caliber = "12 Gauge";
        b10.weight = 437;
        b10.velocity = 1600;
        b10.type = "Slug";
        System.out.println(b10.caliber + " " + b10.weight + " " + b10.velocity + " " + b10.type);
    }
}