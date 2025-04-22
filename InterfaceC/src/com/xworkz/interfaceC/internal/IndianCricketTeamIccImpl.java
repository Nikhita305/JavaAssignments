package com.xworkz.interfaceC.internal;

public class IndianCricketTeamIccImpl implements Icc {

    public IndianCricketTeamIccImpl() {
        System.out.println("No-arg constructor in IndianCricketTeamIccImpl");
    }

    @Override
    public void fairPlay() {
        System.out.println("Indian Cricket Team follows fair play");
    }
}