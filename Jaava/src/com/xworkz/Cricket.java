package com.xworkz;

public class Cricket {

    public void run(RCB rcb){
        System.out.println("Cricket is calling RCb");
        if(rcb!=null){
            rcb.takeWicket();
        }
        else {
            System.out.println("reference is pointing to null");
        }
    }
}