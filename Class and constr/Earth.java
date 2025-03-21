class Earth {
    String continent;
    int population; 
    double area; 
    String climate;

    Earth() {
        System.out.println("Earth instance created!");
    }

    public static void main(String[] args) {
        Earth e1 = new Earth();
        e1.continent = "Asia";
        e1.population = 4600;
        e1.area = 44.58;
        e1.climate = "Humid";
        System.out.println(e1.continent + " " + e1.population + " " + e1.area + " " + e1.climate);

        Earth e2 = new Earth();
        e2.continent = "Africa";
        e2.population = 1400;
        e2.area = 30.37;
        e2.climate = "Hot";
        System.out.println(e2.continent + " " + e2.population + "M " + e2.area + " " + e2.climate);

        Earth e3 = new Earth();
        e3.continent = "North America";
        e3.population = 600;
        e3.area = 24.71;
        e3.climate = "Temperate";
        System.out.println(e3.continent + " " + e3.population + " " + e3.area + "" + e3.climate);

        Earth e4 = new Earth();
        e4.continent = "South America";
        e4.population = 430;
        e4.area = 17.84;
        e4.climate = "Tropical";
        System.out.println(e4.continent + " " + e4.population + " " + e4.area + " " + e4.climate);

        Earth e5 = new Earth();
        e5.continent = "Europe";
        e5.population = 750;
        e5.area = 10.18;
        e5.climate = "Cold";
        System.out.println(e5.continent + " " + e5.population + " " + e5.area + " " + e5.climate);

        Earth e6 = new Earth();
        e6.continent = "Australia";
        e6.population = 43;
        e6.area = 8.56;
        e6.climate = "Desert & Coastal";
        System.out.println(e6.continent + " " + e6.population + " " + e6.area + " " + e6.climate);

        Earth e7 = new Earth();
        e7.continent = "Antarctica";
        e7.population = 0;
        e7.area = 14.00;
        e7.climate = "Freezing";
        System.out.println(e7.continent + " " + e7.population + " " + e7.area + " " + e7.climate);

        Earth e8 = new Earth();
        e8.continent = "Greenland";
        e8.population = 0.056;
        e8.area = 2.166;
        e8.climate = "Arctic";
        System.out.println(e8.continent + " " + e8.population + " " + e8.area + " " + e8.climate);

        Earth e9 = new Earth();
        e9.continent = "Oceania";
        e9.population = 42;
        e9.area = 8.52;
        e9.climate = "Tropical & Coastal";
        System.out.println(e9.continent + " " + e9.population + " " + e9.area + " " + e9.climate);

        Earth e10 = new Earth();
        e10.continent = "Middle East";
        e10.population = 450;
        e10.area = 7.2;
        e10.climate = "Arid";
        System.out.println(e10.continent + " " + e10.population + " " + e10.area + " " + e10.climate);
    }
}
