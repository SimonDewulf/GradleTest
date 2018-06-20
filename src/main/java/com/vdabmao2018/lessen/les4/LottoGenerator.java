package com.vdabmao2018.lessen.les4;

import java.util.Arrays;

public class LottoGenerator {
    public static void main(String[] args) {


        //genereer 6 verschillende nummers van 1-45.

//hints: Array.sort()   Arrays.binarySearch()

        int max = 45;
        int min = 1;

        int randomNumber = (int) (Math.random() * (max - min + 1) + min);

        int[] draw = new int[6];

        for (int i = 0; i < 6; i++) {

            draw[i] = (int) (Math.random() * (max - min + 1) + min);
            for (int j = i + 1; j < draw.length; j++) {
                if (draw[i] == draw[j]) {
                    i--;
                }
            }
            if (i > 4) {
                for (int j = 0; j < 5; j++) {
                    if (draw[5] == draw[j]) {
                        i--;
                    }
                }
            }

        }
        Arrays.sort(draw);

        for (int i = 0; i < draw.length; i++) {
            System.out.print(draw[i] + "\t");
        }


    }
}
