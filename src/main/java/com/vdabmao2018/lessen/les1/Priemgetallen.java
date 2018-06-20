package com.vdabmao2018.lessen.les1;

import java.util.Scanner;

public class Priemgetallen {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter any integer");
        int input = sc.nextInt();
        int a = 2;
        boolean isPrime = false;

        for (int i = 2; i < (input); i++) {

            if (input % i == 0) {
                System.out.println(input + " is dividable by " + i + " and is therefore not a prime");

            } else {
                a++;
                if (a == input) {
                    System.out.println(input + " is a prime");
                    isPrime = true;
                }

            }

        }
        System.out.println(isPrime);


    }
}
