package com.inheritance;

public class DSLR extends Camera {
    public DSLR() {
        System.out.println("Running no-arg constructor of DSLR");
    }

    @Override
    public void brand() {
        System.out.println("DSLRs are made by Canon, Nikon, Sony, etc.");
    }

    @Override
    public void resolution() {
        System.out.println("DSLRs usually offer 20MP to 50MP resolution");
    }

    @Override
    public void lensType() {
        System.out.println("DSLRs support interchangeable lenses");
    }

    @Override
    public void storage() {
        System.out.println("DSLRs use SD cards or CF cards for storage");
    }

    @Override
    public void connectivity() {
        System.out.println("DSLRs often support USB, HDMI, and wireless transfer");
    }
}
