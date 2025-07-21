package com.kodnest.typecasting;

public class t18 {
    public static void main(String[] args) {
        int totalRows = 9;
        int mid = 5;

        for (int i = 1; i <= totalRows; i++) {
            int stars;
            if (i <= mid) {
                stars = i;
            } else {
                stars = totalRows - i + 1; 
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

