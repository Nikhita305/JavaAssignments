package com.kodnest.typecasting;

public class t15 {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++){
            for(int j=1; j<=5; j++){
                if(i%2 == 0){
                    System.out.print("#");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
