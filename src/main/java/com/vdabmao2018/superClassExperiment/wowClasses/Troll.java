package com.vdabmao2018.superClassExperiment.wowClasses;

public class Troll extends Race{

    Faction faction = new Horde();
    public void passiveRacial(){
        System.out.println("regeneration");
    }
    public void activeRacial(){
        System.out.println("berserker rage/blood frenzy whatever");
    }
}
