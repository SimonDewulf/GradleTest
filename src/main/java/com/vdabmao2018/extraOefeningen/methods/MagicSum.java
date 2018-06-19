package com.vdabmao2018.extraOefeningen.methods;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int magicSum = 0;

        for (int i = 0; i <= 1000; i++) {

            System.out.print("enter a positive number, or -1 to exit: ");
            int input = sc.nextInt();
            if (input == -1) {
                i += 1000;
            } else if (MagicSum.hasEight(input)) {
                magicSum = magicSum + input;
            }

            System.out.println("sum of every number with an 8 = " + magicSum);

        }


    }

    public static boolean hasEight(int a) {

        boolean hasEight = false;
        for (int i = 1; i < 50; i++) {
            if (a % 10 == 8) {
                hasEight = true;
            }
            if (a < 10) {
                i += 50;
            }
            a = (a / 10);
        }
        return hasEight;
    }
}
