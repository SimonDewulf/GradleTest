package com.vdabmao2018.superClassExperiment.wowClasses;

public class Goblin extends Race {
    public Goblin() {
        this.faction = new Horde();
    }

    @Override
    void activeRacial() {
        System.out.println("rocket Jump");
    }

    @Override
    void passiveRacial() {
        System.out.println("more haste");

    }
}
