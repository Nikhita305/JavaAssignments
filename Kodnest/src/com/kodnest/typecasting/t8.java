package com.kodnest.typecasting;

import java.util.Scanner;

class t8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();               // number of strings
        String[] arr = new String[l];       // create string array

        for(int i = 0; i < l; i++) {
            arr[i] = sc.next();             // read each string
        }

        int m = sc.nextInt();               // index 1
        int n = sc.nextInt();               // index 2

        int m1 = arr[m].length();           // length of string at index m
        int n1 = arr[n].length();           // length of string at index n

        System.out.print(m1);               // print length of m-th string
        System.out.print(n1);               // print length of n-th string
    }
}

