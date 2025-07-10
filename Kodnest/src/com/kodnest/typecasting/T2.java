package com.kodnest.typecasting;

public class T2 {
    public static void main(String[] args) {
        // char to byte
        char a = 'A'; // 65
        byte b = (byte) a;
        System.out.println("char to byte:");
        System.out.println(a);
        System.out.println(b);

        // char to short
        char c = 'B'; // 66
        short d = (short) c;
        System.out.println("char to short:");
        System.out.println(c);
        System.out.println(d);

        // char to int
        char e = 'C'; // 67
        int f = e; // implicit
        System.out.println("char to int:");
        System.out.println(e);
        System.out.println(f);

        // char to long
        char g = 'D'; // 68
        long h = g;
        System.out.println("char to long:");
        System.out.println(g);
        System.out.println(h);

        // char to float
        char i = 'E'; // 69
        float j = i;
        System.out.println("char to float:");
        System.out.println(i);
        System.out.println(j);

        // char to double
        char k = 'F'; // 70
        double l = k;
        System.out.println("char to double:");
        System.out.println(k);
        System.out.println(l);

        // byte to char
        byte m = 71;
        char n = (char) m;
        System.out.println("byte to char:");
        System.out.println(m);
        System.out.println(n);

        // short to char
        short o = 72;
        char p = (char) o;
        System.out.println("short to char:");
        System.out.println(o);
        System.out.println(p);

        // int to char
        int q = 73;
        char r = (char) q;
        System.out.println("int to char:");
        System.out.println(q);
        System.out.println(r);

        // long to char
        long s = 74L;
        char t = (char) s;
        System.out.println("long to char:");
        System.out.println(s);
        System.out.println(t);

        // float to char
        float u = 75.9f;
        char v = (char) u;
        System.out.println("float to char:");
        System.out.println(u);
        System.out.println(v);

        // double to char
        double w = 76.9;
        char x = (char) w;
        System.out.println("double to char:");
        System.out.println(w);
        System.out.println(x);
    }
}
