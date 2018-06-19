package com.vdabmao2018.extraOefeningen.methods;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(IsOdd.isOdd(input));
    }


    public static boolean isOdd(int a) {
        boolean isOdd;
        if (a % 2 == 0) {
            isOdd = true;
        } else {
            isOdd = false;
        }
        return isOdd;

    }
}

