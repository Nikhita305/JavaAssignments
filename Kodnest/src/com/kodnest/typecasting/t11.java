package com.kodnest.typecasting;

public class t11 {
    public static void main(String[] args) {
        int i = 1;
        while(i<=3){
            int j = 1;
            while(j<=4){
                System.out.println(i+" "+j);
                j++;
            }
            i++;
        }
        System.out.println("******************");
        i = 1;
        do{
            int j = 1;
            do {
                System.out.println(i+" "+j);
                j++;
            }
            while(j<=4);
            i++;
        }
        while(i<=3);
    }
}
