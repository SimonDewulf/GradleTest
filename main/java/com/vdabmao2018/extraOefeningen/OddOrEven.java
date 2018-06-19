package com.vdabmao2018.extraOefeningen;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        int input = sc.nextInt();

        if (input % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        System.out.println("BYE");

    }
}
