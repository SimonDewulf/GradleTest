package com.vdabmao2018.superClassExperiment.wowClasses;

public enum Fire{




    FIREBALL(10, 3), SCORCH(3, 1), PYROBLAST(9000, 5), FIREBLAST(4, 0), FLAMESTRIKE(200, 4), PHOENIXFLAMES(5000, 0);


    int damage;
    int casttime;

    Fire(int damage, int casttime) {
        this.damage = damage;
        this.casttime = casttime;
    }


    //todo: CONSTRUCTOR YOU MORON
    //TODO: EVERY VARIABLE ABOVE IS AN INSTANCE OF Fire => THE DATA INPUTTED


}
