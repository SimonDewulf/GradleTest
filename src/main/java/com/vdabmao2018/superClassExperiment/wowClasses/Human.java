package com.vdabmao2018.superClassExperiment.wowClasses;

public class Human extends Race {

    public Human() {
        this.faction = new Alliance();

    }

    @Override
    void activeRacial() {
        System.out.println("human resolve");
    }

    @Override
    void passiveRacial() {
        System.out.println("i dunno some reputation shit");
    }
}
