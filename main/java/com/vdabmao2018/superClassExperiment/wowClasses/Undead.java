package com.vdabmao2018.superClassExperiment.wowClasses;

public class Undead extends Race {

    public Undead() {
        this.faction = new Horde();
    }


    @Override
    void activeRacial() {
        System.out.println("fearbreak");
    }

    @Override
    void passiveRacial() {
        System.out.println("something that is absolutely horseshit cause people only play undead for casting animations");
    }
}
