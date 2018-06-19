package com.vdabmao2018.superClassExperiment.wowClasses;

public class Draenei extends Race {
    public Draenei() {
        this.faction = new Alliance();
    }


    @Override
    void activeRacial() {
        System.out.println("gift of the Naaru");
    }

    @Override
    void passiveRacial() {
        System.out.println(" i have no idea");

    }
}
