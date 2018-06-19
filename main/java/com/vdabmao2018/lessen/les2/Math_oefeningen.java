package com.vdabmao2018.lessen.les2;

import java.util.Scanner;

public class Math_oefeningen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter an integer");
        int x = sc.nextInt();


        double log = (2 * Math.log10(x)) / Math.sqrt(x);

        double area = Math.PI * Math.pow(x, 2);

        double c = 2 * Math.PI * x;

        double y = 2 * x + Math.sin(x / 3);

        double z = (x + 3 * Math.sqrt(x)) / 2;

        double gravitationConstant = 6.67E-11;

        int massa1 = 20;
        int massa2 = 30;

        int distance = 20;

        double F = gravitationConstant * massa1 * massa2 / Math.pow(distance, 2);

        double f = Math.log(5);


        System.out.println(log);
        System.out.println(area);
        System.out.println(c);
        System.out.println(y);
        System.out.println(z);
        System.out.println(F);
        System.out.println(f);


    }
}
