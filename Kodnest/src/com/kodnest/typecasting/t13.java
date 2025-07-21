package com.kodnest.typecasting;

public class t13 {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            for(int j=1; j<=4;j++){
                if(i==2){
                    continue;
                }
                System.out.print(" i:"+i+" j:"+j);
            }
        }
        System.out.println(" ");
        outer : for(int i=1; i<=3; i++){
            inner : for(int j=1; j<=4;j++){
                if(i==2){
                    break outer;
                }
                System.out.print(" i:"+i+" j:"+j);
            }
        }
    }
}
