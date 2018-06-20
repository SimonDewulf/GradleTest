package com.vdabmao2018.lessen.les1;

import java.util.Scanner;

public class Leeftijd {
    public static void main(String[] args) {


        System.out.println("what's your birthyear?");
        Scanner sc = new Scanner(System.in);

        int birthYear = sc.nextInt();
        int currentYear = 2018;
        int age = currentYear - birthYear;

        System.out.println("Your age is " + age);

    }
}
