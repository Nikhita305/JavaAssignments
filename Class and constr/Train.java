class Train {
    String name;
    int coaches;
    double speed;
    String type;

    Train() {
        System.out.println("Train created!");
    }

    public static void main(String[] args) {
        Train t1 = new Train();
        t1.name = "Rajdhani Express";
        t1.coaches = 20;
        t1.speed = 130;
        t1.type = "Express";
        System.out.println(t1.name + " " + t1.coaches + " " + t1.speed + " " + t1.type);

        Train t2 = new Train();
        t2.name = "Shatabdi Express";
        t2.coaches = 15;
        t2.speed = 150;
        t2.type = "Superfast";
        System.out.println(t2.name + " " + t2.coaches + " " + t2.speed + " " + t2.type);

        Train t3 = new Train();
        t3.name = "Duronto Express";
        t3.coaches = 18;
        t3.speed = 140;
        t3.type = "Express";
        System.out.println(t3.name + " " + t3.coaches + " " + t3.speed + " " + t3.type);

        Train t4 = new Train();
        t4.name = "Vande Bharat Express";
        t4.coaches = 16;
        t4.speed = 180;
        t4.type = "Semi-High Speed";
        System.out.println(t4.name + " " + t4.coaches + " " + t4.speed + " " + t4.type);

        Train t5 = new Train();
        t5.name = "Garib Rath";
        t5.coaches = 22;
        t5.speed = 130;
        t5.type = "Economy Express";
        System.out.println(t5.name + " " + t5.coaches + " " + t5.speed + " " + t5.type);

        Train t6 = new Train();
        t6.name = "Tejas Express";
        t6.coaches = 18;
        t6.speed = 160;
        t6.type = "Luxury";
        System.out.println(t6.name + " " + t6.coaches + " " + t6.speed + " " + t6.type);

        Train t7 = new Train();
        t7.name = "Gatiman Express";
        t7.coaches = 12;
        t7.speed = 160;
        t7.type = "High Speed";
        System.out.println(t7.name + " " + t7.coaches + " " + t7.speed + " " + t7.type);

        Train t8 = new Train();
        t8.name = "Deccan Queen";
        t8.coaches = 14;
        t8.speed = 120;
        t8.type = "Passenger";
        System.out.println(t8.name + " " + t8.coaches + " " + t8.speed + " " + t8.type);

        Train t9 = new Train();
        t9.name = "Maharajas' Express";
        t9.coaches = 10;
        t9.speed = 100;
        t9.type = "Luxury";
        System.out.println(t9.name + " " + t9.coaches + " " + t9.speed + " " + t9.type);

        Train t10 = new Train();
        t10.name = "Palace on Wheels";
        t10.coaches = 13;
        t10.speed = 110;
        t10.type = "Heritage";
        System.out.println(t10.name + " " + t10.coaches + " " + t10.speed + " " + t10.type);
    }
}
