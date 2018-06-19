package com.vdabmao2018.lessen.les10;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {




        //comparable interface sorteert aan de hand van todo: opzoeken die handel


//printen die handel
//verwijder alles dat start met "j"

        ArrayList<String> namen = new ArrayList();  //de < ... > GARANDEERD dat de arraylist enkel voor Strings gebruikt kan worden => nu is namen.toString redundant en kun js String methods zomaar uitvoeren.
        namen.add("Jimi");
        namen.add("James");
        namen.add("Amy");
        namen.add("Kurt");
        namen.add("Jim");


  /*      for (int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));

        }*/



        for(int i = 0; i < namen.size(); i++){
          if(namen.get(i)/*.toString()*/.substring(0, 1).toLowerCase().equals("j")){
              System.out.println(namen.get(i));
              namen.remove(i);

          }
        }



        for (int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));

        }

    }
}
