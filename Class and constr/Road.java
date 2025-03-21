class Road {
    String name;
    int length;
    int lanes;
    String type;

    Road() {
        System.out.println("Road created!");
        name = "Unknown";
        length = 0;
        lanes = 0;
        type = "Unknown";
    }

    public static void main(String[] args) {
        Road r1 = new Road();
        r1.name = "Golden Quadrilateral";
        r1.length = 5846;
        r1.lanes = 6;
        r1.type = "Highway";
        System.out.println(r1.name + " " + r1.length + " " + r1.lanes + " " + r1.type);

        Road r2 = new Road();
        r2.name = "Yamuna Expressway";
        r2.length = 165;
        r2.lanes = 6;
        r2.type = "Expressway";
        System.out.println(r2.name + " " + r2.length + " " + r2.lanes + " " + r2.type);

        Road r3 = new Road();
        r3.name = "Mumbai-Pune Expressway";
        r3.length = 94;
        r3.lanes = 6;
        r3.type = "Expressway";
        System.out.println(r3.name + " " + r3.length + " " + r3.lanes + " " + r3.type);

        Road r4 = new Road();
        r4.name = "Delhi-Meerut Expressway";
        r4.length = 96;
        r4.lanes = 14;
        r4.type = "Expressway";
        System.out.println(r4.name + " " + r4.length + " " + r4.lanes + " " + r4.type);

        Road r5 = new Road();
        r5.name = "NH44";
        r5.length = 3745;
        r5.lanes = 4;
        r5.type = "Highway";
        System.out.println(r5.name + " " + r5.length + " " + r5.lanes + " " + r5.type);

        Road r6 = new Road();
        r6.name = "Western Express Highway";
        r6.length = 25;
        r6.lanes = 8;
        r6.type = "Urban Road";
        System.out.println(r6.name + " " + r6.length + " " + r6.lanes + " " + r6.type);

        Road r7 = new Road();
        r7.name = "Eastern Peripheral Expressway";
        r7.length = 135;
        r7.lanes = 6;
        r7.type = "Expressway";
        System.out.println(r7.name + " " + r7.length + " " + r7.lanes + " " + r7.type);

        Road r8 = new Road();
        r8.name = "Bandra-Worli Sea Link";
        r8.length = 5;
        r8.lanes = 8;
        r8.type = "Bridge Road";
        System.out.println(r8.name + " " + r8.length + " " + r8.lanes + " " + r8.type);

        Road r9 = new Road();
        r9.name = "Marine Drive";
        r9.length = 3;
        r9.lanes = 4;
        r9.type = "Urban Road";
        System.out.println(r9.name + " " + r9.length + " " + r9.lanes + " " + r9.type);

        Road r10 = new Road();
        r10.name = "Kolkata-Basanti Highway";
        r10.length = 100;
        r10.lanes = 2;
        r10.type = "State Highway";
        System.out.println(r10.name + " " + r10.length + " " + r10.lanes + " " + r10.type);
    }
}
