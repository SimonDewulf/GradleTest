package com.vdabmao2018.lessen.les7.interfaceSpaceShip;


import java.sql.SQLOutput;

interface Capitol {
    void cannon();

}

interface Carrier{  //CLASSES KUNNEN VAN MEERDERE INTERFACES IMPLEMENTEREN. => basis is extreem abstract, maar kan sinds java 8 toch niet-abstracte functies implementeren
                    //ELKE FIELD GEDEFINIEERD IN EEN INTERFACE =     PUBLIC   STATIC    FINAL => vb: Math.PI => permanente constante variabele
    void launchfighters();
    }

class Spaceship implements Carrier, Capitol{
    public void cannon(){
        System.out.println("fire the cannons");

    }

    public void launchfighters(){

        System.out.println("GET TO THE CHOPPAAA");

    }
}
