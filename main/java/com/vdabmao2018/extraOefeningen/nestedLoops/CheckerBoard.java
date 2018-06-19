package com.vdabmao2018.extraOefeningen.nestedLoops;

public class CheckerBoard {
    public static void main(String[] args) {


        for (int i = 1; i <= 8; i++) {
            System.out.println();
            if (i % 2 == 0)
                System.out.print(" ");
            for (int j = 0; j < 8; j++) {
                System.out.print("#");
            }
        }

    }
}
