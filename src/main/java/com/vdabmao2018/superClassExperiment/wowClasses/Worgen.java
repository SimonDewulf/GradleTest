package com.vdabmao2018.superClassExperiment.wowClasses;

public class Worgen extends Race{

    public Worgen() {
        this.faction = new Alliance();
    }

    @Override
    void activeRacial() {
        System.out.println("stoeme furries");
    }

    @Override
    void passiveRacial() {
        System.out.println("extra stoeme furries");
    }
}
