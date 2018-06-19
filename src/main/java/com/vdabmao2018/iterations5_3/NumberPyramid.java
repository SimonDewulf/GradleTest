package com.vdabmao2018.iterations5_3;

public class NumberPyramid {
    public static void main(String[] args) {


        int max = 7;

        for (int i = 0; i <= max; i++) {

            for (int g = max - 1; g >= i; g--) {


                System.out.print("  ");
            }


            for (int j = 0; j <= i; j++) {
                System.out.print((int) Math.pow(2, j) + " ");       //countup

            }

            for (int k = i - 1; k >= 0; k--) {                    //countdown

                System.out.print((int) Math.pow(2, k) + " ");

            }
            System.out.println();


        }


    }
}