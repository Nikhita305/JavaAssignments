package com.kodnest.typecasting;

import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int n = sc.nextInt();
        int p = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                p *= i;
            }
        }
        System.out.println(p);
    }
}
