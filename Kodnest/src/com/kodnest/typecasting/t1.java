package com.kodnest.typecasting;

public class t1 {
    public static void main(String[] args){
        byte a = 49;
        double b ;
        b = a;
        System.out.println(a);
        System.out.println(b);

        int c = 98765;
        float d = c;
        System.out.println(c);
        System.out.println(d);

        float e = 33.5f;
        int f;
        f = (int)e ;
        System.out.println(e);
        System.out.println(f);

        long g = 343654L;
        float h;
        h = g;
        System.out.println(h);
        System.out.println(g);

        float i = 48.283f;
        long j;
        j = (long)i;
        System.out.println(i);
        System.out.println(j);
    }
}
