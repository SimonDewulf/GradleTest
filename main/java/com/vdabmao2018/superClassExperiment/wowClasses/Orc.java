package com.vdabmao2018.superClassExperiment.wowClasses;

public class Orc extends Race {

    public Orc() {
        this.faction = new Horde();
    }


    @Override
    void activeRacial() {
        System.out.println("blood frenzy");
    }

    @Override
    void passiveRacial() {
        System.out.println("more pet damage");
    }
}
