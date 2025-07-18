package com.kodnest.typecasting;

public class t13 {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            for(int j=1; j<=4;j++){
                if(j==2){
                    continue;
                }
                System.out.print(" i:"+i+" j:"+j);
            }
        }
        System.out.println(" ");
        for(int i=1; i<=3; i++){
            for(int j=1; j<=4;j++){
                if(j==2){
                    break;
                }
                System.out.print(" i:"+i+" j:"+j);
            }
        }
    }
}
