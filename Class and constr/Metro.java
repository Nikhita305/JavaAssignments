class Metro {
    String city;
    int numberOfStations;
    double ticket;
    int passengers;

    Metro() {
        System.out.println("Metro object created!");
    }

    public static void main(String[] args) {
        Metro m1 = new Metro();
        m1.city = "Manglore";
        m1.numberOfStations = 285;
        m1.ticket = 50.0;
        m1.passengers = 500000;
        System.out.println(m1.city + " " + m1.numberOfStations + " " + m1.ticket + " " + m1.passengers);

        Metro m2 = new Metro();
        m2.city = "Mumbai";
        m2.numberOfStations = 14;
        m2.ticket = 40.0;
        m2.passengers = 300000;
        System.out.println(m2.city + " " + m2.numberOfStations + " " + m2.ticket + " " + m2.passengers);

        Metro m3 = new Metro();
        m3.city = "Bangalore";
        m3.numberOfStations = 51;
        m3.ticket = 35.0;
        m3.passengers = 200000;
        System.out.println(m3.city + " " + m3.numberOfStations + " " + m3.ticket + " " + m3.passengers);

        Metro m4 = new Metro();
        m4.city = "Hyderabad";
        m4.numberOfStations = 57;
        m4.ticket = 45.0;
        m4.passengers = 250000;
        System.out.println(m4.city + " " + m4.numberOfStations + " " + m4.ticket + " " + m4.passengers);

        Metro m5 = new Metro();
        m5.city = "Chennai";
        m5.numberOfStations = 42;
        m5.ticket = 30.0;
        m5.passengers = 180000;
        System.out.println(m5.city + " " + m5.numberOfStations + " " + m5.ticket + " " + m5.passengers);

        Metro m6 = new Metro();
        m6.city = "Kolkata";
        m6.numberOfStations = 34;
        m6.ticket = 25.0;
        m6.passengers = 150000;
        System.out.println(m6.city + " " + m6.numberOfStations + " " + m6.ticket + " " + m6.passengers);

        Metro m7 = new Metro();
        m7.city = "Jaipur";
        m7.numberOfStations = 11;
        m7.ticket = 20.0;
        m7.passengers = 100000;
        System.out.println(m7.city + " " + m7.numberOfStations + " " + m7.ticket + " " + m7.passengers);

        Metro m8 = new Metro();
        m8.city = "Lucknow";
        m8.numberOfStations = 21;
        m8.ticket = 30.0;
        m8.passengers = 120000;
        System.out.println(m8.city + " " + m8.numberOfStations + " " + m8.ticket + " " + m8.passengers);

        Metro m9 = new Metro();
        m9.city = "Nagpur";
        m9.numberOfStations = 38;
        m9.ticket = 25.0;
        m9.passengers = 110000;
        System.out.println(m9.city + " " + m9.numberOfStations + " " + m9.ticket + " " + m9.passengers);

        Metro m10 = new Metro();
        m10.city = "Ahmedabad";
        m10.numberOfStations = 32;
        m10.ticket = 35.0;
        m10.passengers = 130000;
        System.out.println(m10.city + " " + m10.numberOfStations + " " + m10.ticket + " " + m10.passengers);
    }
}
