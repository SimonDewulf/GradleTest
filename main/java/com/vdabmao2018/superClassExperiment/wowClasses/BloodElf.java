package com.vdabmao2018.superClassExperiment.wowClasses;

public class BloodElf extends Race {

    public BloodElf() {
        this.faction = new Horde();


    }

    @Override
    void activeRacial() {
        System.out.println("arcane torrent");
    }

    @Override
    void passiveRacial() {
        System.out.println("some resource bullshit");

    }
}
