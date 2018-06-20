package com.vdabmao2018.lessen.les5.beehive;

public class Soldier extends Bee {

    public Soldier(String name, int hitpoints, String weapon, int armor) {
        super(name);
        this.hitpoints = hitpoints;
        this.weapon = weapon;
        this.armor = armor;
    }

    int hitpoints = 100;
    String weapon;
    int armor = 10;


    public void heal(Soldier patient){
        System.out.println(this.getName() + " heals " + patient.getName() + " with the gift of the light");
        patient.hitpoints += 20;

    }

    public void attack(Soldier victim){


        System.out.println(this.getName() + " attacks " + victim.getName() + " with vigour, wounding him greatly");
        victim.hitpoints = victim.hitpoints - 40 + armor;
        victim.isDead();


    }

    public boolean isDead(){

            boolean isDead = false;

            if(hitpoints <=0) {
                System.out.println(this.getName() + " succumbs to his wounds and dies in an agony that will frighten his descendants for generations to come");
                isDead = true;

            }
            return isDead;

    }







}
