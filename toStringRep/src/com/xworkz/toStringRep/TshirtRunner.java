package com.xworkz.toStringRep;

public class TshirtRunner {
    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt();
        tshirt1.setBrand("Max");
        tshirt1.setSize(30);
        tshirt1.setColor("black");

        Tshirt tshirt2 = new Tshirt();
        tshirt2.setBrand("Max");
        tshirt2.setSize(50);
        tshirt2.setColor("black");

        System.out.println("Check location "+(tshirt1==tshirt2));
        boolean same = tshirt2.equals(tshirt1);
        System.out.println("Both are same? "+same);
    }
}
