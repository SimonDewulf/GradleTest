package com.vdabmao2018.extraOefeningen;

import java.util.Scanner;

public class PrintNumberInWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer between 0 and 9");
        int input = sc.nextInt();

        if (input == 0) {
            System.out.println("zero");

        } else if (input == 1) {
            System.out.println("one");

        } else if (input == 2) {
            System.out.println("two");

        } else if (input == 3) {
            System.out.println("three");
        } else if (input == 4) {
            System.out.println("four");

        } else if (input == 5) {
            System.out.println("five");

        } else if (input == 6) {
            System.out.println("six");

        } else if (input == 7) {
            System.out.println("seven");

        } else if (input == 8) {
            System.out.println("eight");

        } else if (input == 9) {
            System.out.println("nine");

        } else {
            System.out.println("other number");
        }


        switch (input) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("other number");
                break;
        }
    }
}
