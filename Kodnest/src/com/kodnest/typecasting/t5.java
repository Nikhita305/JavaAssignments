package com.kodnest.typecasting;

public class t5 {
    public static void main(String[] args) {
        String fName = "Ajaay";
        String lName = "Singh";
        String fullName = printName(fName,lName);
        System.out.println(fullName);
    }
    static String printName(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        return fullName;
    }
}
