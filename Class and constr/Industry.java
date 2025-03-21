class Industry {
    String name;
    String sector;
    int employees;
    double revenue;

    Industry() {
        System.out.println("Industry created!");
    }

    public static void main(String[] args) {
        Industry i1 = new Industry();
        i1.name = "Google";
        i1.sector = "Technology";
        i1.employees = 150000;
        i1.revenue = 280.5;
        System.out.println(i1.name + " " + i1.sector + " " + i1.employees + " " + i1.revenue);

        Industry i2 = new Industry();
        i2.name = "Amazon";
        i2.sector = "E-commerce";
        i2.employees = 1600000;
        i2.revenue = 500.7;
        System.out.println(i2.name + " " + i2.sector + " " + i2.employees + " " + i2.revenue);

        Industry i3 = new Industry();
        i3.name = "Microsoft";
        i3.sector = "Software";
        i3.employees = 220000;
        i3.revenue = 320.9;
        System.out.println(i3.name + " " + i3.sector + " " + i3.employees + " " + i3.revenue);

        Industry i4 = new Industry();
        i4.name = "Tesla";
        i4.sector = "Automobile";
        i4.employees = 127000;
        i4.revenue = 250.8;
        System.out.println(i4.name + " " + i4.sector + " " + i4.employees + " " + i4.revenue);

        Industry i5 = new Industry();
        i5.name = "Apple";
        i5.sector = "Consumer Electronics";
        i5.employees = 154000;
        i5.revenue = 600.4;
        System.out.println(i5.name + " " + i5.sector + " " + i5.employees + " " + i5.revenue);

        Industry i6 = new Industry();
        i6.name = "IBM";
        i6.sector = "Cloud Computing";
        i6.employees = 280000;
        i6.revenue = 140.2;
        System.out.println(i6.name + " " + i6.sector + " " + i6.employees + " " + i6.revenue);

        Industry i7 = new Industry();
        i7.name = "Samsung";
        i7.sector = "Electronics";
        i7.employees = 266000;
        i7.revenue = 220.1;
        System.out.println(i7.name + " " + i7.sector + " " + i7.employees + " " + i7.revenue);

        Industry i8 = new Industry();
        i8.name = "Facebook";
        i8.sector = "Social Media";
        i8.employees = 83000;
        i8.revenue = 120.6;
        System.out.println(i8.name + " " + i8.sector + " " + i8.employees + " " + i8.revenue);

        Industry i9 = new Industry();
        i9.name = "Netflix";
        i9.sector = "Entertainment";
        i9.employees = 12000;
        i9.revenue = 40.3;
        System.out.println(i9.name + " " + i9.sector + " " + i9.employees + " " + i9.revenue);

        Industry i10 = new Industry();
        i10.name = "Coca-Cola";
        i10.sector = "Beverages";
        i10.employees = 79000;
        i10.revenue = 38.7;
        System.out.println(i10.name + " " + i10.sector + " " + i10.employees + " " + i10.revenue);
    }
}
