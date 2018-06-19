package com.vdabmao2018.iterations5_3;

import java.text.DecimalFormat;

public class Pi {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00000");

        double x = 1;

        for (double i = 3; i < 1000000; i += 4) {
            x = x - (1 / i) + (1 / (i + 2));

        }
        double pi = 4 * (x);

        System.out.println(df.format(pi));


    }
}
