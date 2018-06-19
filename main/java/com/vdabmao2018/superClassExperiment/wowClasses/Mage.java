package com.vdabmao2018.superClassExperiment.wowClasses;

public class Mage implements Class{
    private String name;
    private Race race;
    private MageAbilities[] mageSpec;
    private Frost[] frost;
    private Fire[] fire;
    private Arcane[] Arcane;

    public Mage(String name, Race race, Fire[] fire) {
        this.name = name;
        this.race = race;

        this.fire = fire;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }


}
