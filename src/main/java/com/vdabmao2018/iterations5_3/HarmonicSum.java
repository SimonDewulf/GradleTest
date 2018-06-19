package com.vdabmao2018.iterations5_3;

import java.text.DecimalFormat;

public class HarmonicSum {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00000");

        double sum = 0;
        for (double i = 1; i <= 5000; i++) {

            sum = sum + 1 / i;
            System.out.println("test: " + df.format(sum));

        }
        System.out.println(sum);


        double sum2 = 0;

        for (double i = 5000; i > 0; i--) {
            sum2 = sum2 + 1 / i;
            System.out.println("test 2: " + df.format(sum2));
        }
        System.out.println(sum2);


    }
}

