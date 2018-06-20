package com.vdabmao2018.lessen.les1;

import java.text.DecimalFormat;

public class Cramer {
    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;


        double x = (((d * e) - (b * f)) / ((a * d) - (b * c)));
        double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(x));
        System.out.println(df.format(y));

    }
}
