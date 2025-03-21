class Camera {
    String brand;
    int resolution;
    String type;
    double price;

    Camera() {
        System.out.println("Camera created!");
    }

    public static void main(String[] args) {
        Camera c1 = new Camera();
        c1.brand = "Canon";
        c1.resolution = 24;
        c1.type = "DSLR";
        c1.price = 599.99;
        System.out.println(c1.brand + " " + c1.resolution + " " + c1.type + " " + c1.price);

        Camera c2 = new Camera();
        c2.brand = "Nikon";
        c2.resolution = 20;
        c2.type = "Mirrorless";
        c2.price = 499.99;
        System.out.println(c2.brand + " " + c2.resolution + " " + c2.type + " " + c2.price);

        Camera c3 = new Camera();
        c3.brand = "Sony";
        c3.resolution = 42;
        c3.type = "Mirrorless";
        c3.price = 1299.99;
        System.out.println(c3.brand + " " + c3.resolution + " " + c3.type + " " + c3.price);

        Camera c4 = new Camera();
        c4.brand = "Fujifilm";
        c4.resolution = 26;
        c4.type = "Mirrorless";
        c4.price = 899.99;
        System.out.println(c4.brand + " " + c4.resolution + " " + c4.type + " " + c4.price);

        Camera c5 = new Camera();
        c5.brand = "Panasonic";
        c5.resolution = 20;
        c5.type = "Micro Four Thirds";
        c5.price = 699.99;
        System.out.println(c5.brand + " " + c5.resolution + " " + c5.type + " " + c5.price);

        Camera c6 = new Camera();
        c6.brand = "GoPro";
        c6.resolution = 23;
        c6.type = "Action";
        c6.price = 399.99;
        System.out.println(c6.brand + " " + c6.resolution + " " + c6.type + " " + c6.price);

        Camera c7 = new Camera();
        c7.brand = "Olympus";
        c7.resolution = 16;
        c7.type = "Rugged";
        c7.price = 349.99;
        System.out.println(c7.brand + " " + c7.resolution + " " + c7.type + " " + c7.price);

        Camera c8 = new Camera();
        c8.brand = "Leica";
        c8.resolution = 47;
        c8.type = "Rangefinder";
        c8.price = 5499.99;
        System.out.println(c8.brand + " " + c8.resolution + " " + c8.type + " " + c8.price);

        Camera c9 = new Camera();
        c9.brand = "Samsung";
        c9.resolution = 108;
        c9.type = "Smartphone";
        c9.price = 1299.99;
        System.out.println(c9.brand + " " + c9.resolution + " " + c9.type + " " + c9.price);

        Camera c10 = new Camera();
        c10.brand = "DJI";
        c10.resolution = 48;
        c10.type = "Drone";
        c10.price = 999.99;
        System.out.println(c10.brand + " " + c10.resolution + " " + c10.type + " " + c10.price);
    }
}
