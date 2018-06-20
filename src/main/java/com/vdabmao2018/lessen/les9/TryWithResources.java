package com.vdabmao2018.lessen.les9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {

        /*Scanner s = null;
        try {
            s = new Scanner(System.in);
            s.nextInt();

                //scanner doesn't get closed if error is caught in s.nextInt();
                //kun je niet sluiten in catch of finally want normaal geïnitialiseerd in Try => herkent s niet
            s.close();
        }catch (InputMismatchException e){
            System.out.println("caught this shit");
        }finally /{s.close();} //nu is de Scanner erbuiten gedefinieerd => hij kan null zijn => nullpointerexception => toch weer gejost zeker
             //==> blijft maar escalleren dus is er een andere oplosing


        */




        try(Scanner s = new Scanner(System.in)){  //ALLES DAT DE INTERFACE "CLOSEABLE" implementeert. => de .close method wordt dus automatisch uitgevoerd op alles dat een.close heeft, inclusief Scanner dus
            s.nextInt();
        }catch(InputMismatchException r){
            System.out.println("FOUT");
        }















        }
    }

