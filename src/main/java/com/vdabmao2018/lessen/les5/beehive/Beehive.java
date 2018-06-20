package com.vdabmao2018.lessen.les5.beehive;

public class Beehive {
    public static void main(String[] args) {

        Worker maja = new Worker("Maya", 100, 10);
        maja.gatherNectar();
        maja.fly();

        Worker Willy = new Worker("Willy", 10, 100);


        Soldier varian = new Soldier("Varian", 100, "die twee kutzwaarden kweet nimeer",10000 );
        Soldier saurfang = new Soldier("Saurfang", 10000, "Grommgar axe", 1000 );
        Soldier Tyrande = new Soldier("Tyrande", 500, "staff of Elune", 50);


        for(int i = 0; i < 50; i++){
            saurfang.attack(varian);
            if(varian.hitpoints <=0)   {break;}
            Tyrande.heal(varian);

        }



    }

}
