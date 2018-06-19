package com.vdabmao2018.superClassExperiment.wowClasses;

public class Dwarf extends Race {
    public Dwarf() {
        this.faction = new Alliance();
    }

    @Override
    void activeRacial() {
        System.out.println("stoneskin");
    }

    @Override
    void passiveRacial() {
        System.out.println("no fucking clue");
    }
}
