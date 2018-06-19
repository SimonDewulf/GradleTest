package com.vdabmao2018.extraOefeningen.nestedLoops;

public class HashFigures {
    public static void main(String[] args) {

        /*
        ########
        #######
        ######
        #####
        ####
        ###
        ##
        #
         */

        for (int i = 0; i < 8; i++) {
            System.out.println();


            for (int j = 8; j > i; j--) {
                System.out.print("#");
            }
        }
        System.out.println("\n");


        /*
        #
        ##
        ###
        ####
        #####
        ######
        #######
        ########
         */


        for (int i = 0; i < 8; i++) {
            System.out.println();


            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
        }

        System.out.println("\n");

        /*
        ########
         #######
          ######
           #####
            ####
             ###
              ##
               #
         */

        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 8; j > i; j--) {
                System.out.print("#");
            }

        }

        /*
                #
               ##
              ###
             ####
            #####
           ######
          #######
         ########
         */

        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int k = 8; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
                System.out.print("#");
        }


    }
}
