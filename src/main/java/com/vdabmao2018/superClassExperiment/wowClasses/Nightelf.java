package com.vdabmao2018.superClassExperiment.wowClasses;

public class Nightelf extends Race {
    public Nightelf() {
        this.faction = new Alliance();
    }

    @Override
    void activeRacial() {
        System.out.println("shadowmeld");
    }

    @Override
    void passiveRacial() {
        System.out.println("that night&day crit haste stuff");

    }
}
